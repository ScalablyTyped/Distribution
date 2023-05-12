package typings.apolloUsageReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITypeStat extends StObject {
  
  /** TypeStat perFieldStat */
  var perFieldStat: js.UndefOr[StringDictionary[IFieldStat] | Null] = js.undefined
}
object ITypeStat {
  
  inline def apply(): ITypeStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITypeStat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITypeStat] (val x: Self) extends AnyVal {
    
    inline def setPerFieldStat(value: StringDictionary[IFieldStat]): Self = StObject.set(x, "perFieldStat", value.asInstanceOf[js.Any])
    
    inline def setPerFieldStatNull: Self = StObject.set(x, "perFieldStat", null)
    
    inline def setPerFieldStatUndefined: Self = StObject.set(x, "perFieldStat", js.undefined)
  }
}
