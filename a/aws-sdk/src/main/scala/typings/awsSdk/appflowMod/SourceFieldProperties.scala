package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceFieldProperties extends js.Object {
  
  /**
    *  Indicates if the field can be queried. 
    */
  var isQueryable: js.UndefOr[Boolean] = js.native
  
  /**
    *  Indicates whether the field can be returned in a search result. 
    */
  var isRetrievable: js.UndefOr[Boolean] = js.native
}
object SourceFieldProperties {
  
  @scala.inline
  def apply(): SourceFieldProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceFieldProperties]
  }
  
  @scala.inline
  implicit class SourceFieldPropertiesOps[Self <: SourceFieldProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsQueryable(value: Boolean): Self = this.set("isQueryable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsQueryable: Self = this.set("isQueryable", js.undefined)
    
    @scala.inline
    def setIsRetrievable(value: Boolean): Self = this.set("isRetrievable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRetrievable: Self = this.set("isRetrievable", js.undefined)
  }
}
