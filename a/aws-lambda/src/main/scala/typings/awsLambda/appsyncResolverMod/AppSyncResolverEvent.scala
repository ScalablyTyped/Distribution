package typings.awsLambda.appsyncResolverMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.FieldName
import typings.awsLambda.anon.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppSyncResolverEvent[T] extends js.Object {
  
  var arguments: T = js.native
  
  var identity: js.UndefOr[AppSyncIdentityIAM | AppSyncIdentityCognito] = js.native
  
  var info: FieldName = js.native
  
  var request: Headers = js.native
  
  var source: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object AppSyncResolverEvent {
  
  @scala.inline
  def apply[T](arguments: T, info: FieldName, request: Headers): AppSyncResolverEvent[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSyncResolverEvent[T]]
  }
  
  @scala.inline
  implicit class AppSyncResolverEventOps[Self <: AppSyncResolverEvent[_], T] (val x: Self with AppSyncResolverEvent[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArguments(value: T): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: FieldName): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: Headers): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: AppSyncIdentityIAM | AppSyncIdentityCognito): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    
    @scala.inline
    def setSource(value: StringDictionary[js.Any]): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
