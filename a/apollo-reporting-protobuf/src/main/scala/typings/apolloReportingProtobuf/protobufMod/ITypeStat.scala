package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITypeStat extends StObject {
  
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
  implicit class ITypeStatMutableBuilder[Self <: ITypeStat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerFieldStat(value: StringDictionary[IFieldStat]): Self = StObject.set(x, "perFieldStat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerFieldStatNull: Self = StObject.set(x, "perFieldStat", null)
    
    @scala.inline
    def setPerFieldStatUndefined: Self = StObject.set(x, "perFieldStat", js.undefined)
  }
}
