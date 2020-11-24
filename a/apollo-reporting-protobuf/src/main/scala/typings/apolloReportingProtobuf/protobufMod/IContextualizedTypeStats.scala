package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContextualizedTypeStats extends js.Object {
  
  /** ContextualizedTypeStats context */
  var context: js.UndefOr[IStatsContext | Null] = js.native
  
  /** ContextualizedTypeStats perTypeStat */
  var perTypeStat: js.UndefOr[StringDictionary[ITypeStat] | Null] = js.native
}
object IContextualizedTypeStats {
  
  @scala.inline
  def apply(): IContextualizedTypeStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContextualizedTypeStats]
  }
  
  @scala.inline
  implicit class IContextualizedTypeStatsOps[Self <: IContextualizedTypeStats] (val x: Self) extends AnyVal {
    
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
    def setContext(value: IStatsContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setContextNull: Self = this.set("context", null)
    
    @scala.inline
    def setPerTypeStat(value: StringDictionary[ITypeStat]): Self = this.set("perTypeStat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerTypeStat: Self = this.set("perTypeStat", js.undefined)
    
    @scala.inline
    def setPerTypeStatNull: Self = this.set("perTypeStat", null)
  }
}
