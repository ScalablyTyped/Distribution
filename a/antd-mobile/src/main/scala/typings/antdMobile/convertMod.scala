package typings.antdMobile

import typings.antdMobile.antdMobileStrings.range
import typings.antdMobile.antdMobileStrings.single
import typings.dayjs.mod.Dayjs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertMod {
  
  @JSImport("antd-mobile/es/components/calendar/convert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertPageToDayjs(page: Page): Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPageToDayjs")(page.asInstanceOf[js.Any]).asInstanceOf[Dayjs]
  
  inline def convertValueToRange(): DateRange = ^.asInstanceOf[js.Dynamic].applyDynamic("convertValueToRange")().asInstanceOf[DateRange]
  inline def convertValueToRange(selectionMode: single | range): DateRange = ^.asInstanceOf[js.Dynamic].applyDynamic("convertValueToRange")(selectionMode.asInstanceOf[js.Any]).asInstanceOf[DateRange]
  inline def convertValueToRange(selectionMode: single | range, value: js.Date): DateRange = (^.asInstanceOf[js.Dynamic].applyDynamic("convertValueToRange")(selectionMode.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[DateRange]
  inline def convertValueToRange(selectionMode: single | range, value: js.Tuple2[js.Date, js.Date]): DateRange = (^.asInstanceOf[js.Dynamic].applyDynamic("convertValueToRange")(selectionMode.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[DateRange]
  inline def convertValueToRange(selectionMode: Unit, value: js.Date): DateRange = (^.asInstanceOf[js.Dynamic].applyDynamic("convertValueToRange")(selectionMode.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[DateRange]
  inline def convertValueToRange(selectionMode: Unit, value: js.Tuple2[js.Date, js.Date]): DateRange = (^.asInstanceOf[js.Dynamic].applyDynamic("convertValueToRange")(selectionMode.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[DateRange]
  
  type DateRange = (js.Tuple2[js.Date, js.Date]) | Null
  
  trait Page extends StObject {
    
    var month: Double
    
    var year: Double
  }
  object Page {
    
    inline def apply(month: Double, year: Double): Page = {
      val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Page]
    }
    
    extension [Self <: Page](x: Self) {
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
}
