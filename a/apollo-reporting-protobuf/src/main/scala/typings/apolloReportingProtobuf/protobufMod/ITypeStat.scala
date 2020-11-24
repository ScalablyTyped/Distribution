package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITypeStat extends js.Object {
  
  /** TypeStat perFieldStat */
  var perFieldStat: js.UndefOr[StringDictionary[IFieldStat] | Null] = js.native
}
object ITypeStat {
  
  @scala.inline
  def apply(): ITypeStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITypeStat]
  }
  
  @scala.inline
  implicit class ITypeStatOps[Self <: ITypeStat] (val x: Self) extends AnyVal {
    
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
    def setPerFieldStat(value: StringDictionary[IFieldStat]): Self = this.set("perFieldStat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerFieldStat: Self = this.set("perFieldStat", js.undefined)
    
    @scala.inline
    def setPerFieldStatNull: Self = this.set("perFieldStat", null)
  }
}
