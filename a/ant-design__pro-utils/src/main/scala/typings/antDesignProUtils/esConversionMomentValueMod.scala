package typings.antDesignProUtils

import typings.antDesignProUtils.anon.Constructor
import typings.antDesignProUtils.anon.DateFormat
import typings.antDesignProUtils.antDesignProUtilsBooleans.`false`
import typings.dayjs.mod.Dayjs
import typings.rcFieldForm.esInterfaceMod.NamePath
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConversionMomentValueMod {
  
  @JSImport("@ant-design/pro-utils/es/conversionMomentValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conversionMomentValue[T /* <: js.Object */](value: T, dateFormatter: DateFormatter, valueTypeMap: Record[String, DateFormat | Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionMomentValue")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueTypeMap.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conversionMomentValue[T /* <: js.Object */](
    value: T,
    dateFormatter: DateFormatter,
    valueTypeMap: Record[String, DateFormat | Any],
    omitNil: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionMomentValue")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueTypeMap.asInstanceOf[js.Any], omitNil.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conversionMomentValue[T /* <: js.Object */](
    value: T,
    dateFormatter: DateFormatter,
    valueTypeMap: Record[String, DateFormat | Any],
    omitNil: Boolean,
    parentKey: NamePath
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionMomentValue")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueTypeMap.asInstanceOf[js.Any], omitNil.asInstanceOf[js.Any], parentKey.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conversionMomentValue[T /* <: js.Object */](
    value: T,
    dateFormatter: DateFormatter,
    valueTypeMap: Record[String, DateFormat | Any],
    omitNil: Unit,
    parentKey: NamePath
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conversionMomentValue")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueTypeMap.asInstanceOf[js.Any], omitNil.asInstanceOf[js.Any], parentKey.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def convertMoment(value: Dayjs, dateFormatter: String, valueType: String): String | Double | Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("convertMoment")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueType.asInstanceOf[js.Any])).asInstanceOf[String | Double | Dayjs]
  inline def convertMoment(
    value: Dayjs,
    dateFormatter: js.Function2[/* value */ Dayjs, /* valueType */ String, String | Double],
    valueType: String
  ): String | Double | Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("convertMoment")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueType.asInstanceOf[js.Any])).asInstanceOf[String | Double | Dayjs]
  
  inline def convertMoment_false(value: Dayjs, dateFormatter: `false`, valueType: String): String | Double | Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("convertMoment")(value.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any], valueType.asInstanceOf[js.Any])).asInstanceOf[String | Double | Dayjs]
  
  object dateFormatterMap {
    
    @JSImport("@ant-design/pro-utils/es/conversionMomentValue", "dateFormatterMap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/pro-utils/es/conversionMomentValue", "dateFormatterMap.date")
    @js.native
    def date: String = js.native
    
    @JSImport("@ant-design/pro-utils/es/conversionMomentValue", "dateFormatterMap.dateMonth")
    @js.native
    def dateMonth: String = js.native
    inline def dateMonth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateMonth")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-utils/es/conversionMomentValue", "dateFormatterMap.dateQuarter")
    @js.native
    def dateQuarter: String = js.native
    inline def dateQuarter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateQuarter")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-utils/es/conversionMomentValue", "dateFormatterMap.dateRange")
    @js.native
    def dateRange: String = js.native
    inline def dateRange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateRange")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-utils/es/conversionMomentValue", "dateFormatterMap.dateTime")
    @js.native
    def dateTime: String = js.native
    
    @JSImport("@ant-design/pro-utils/es/conversionMomentValue", "dateFormatterMap.dateTimeRange")
    @js.native
    def dateTimeRange: String = js.native
    inline def dateTimeRange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateTimeRange")(x.asInstanceOf[js.Any])
    
    inline def dateTime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-utils/es/conversionMomentValue", "dateFormatterMap.dateWeek")
    @js.native
    def dateWeek: String = js.native
    inline def dateWeek_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateWeek")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-utils/es/conversionMomentValue", "dateFormatterMap.dateYear")
    @js.native
    def dateYear: String = js.native
    inline def dateYear_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateYear")(x.asInstanceOf[js.Any])
    
    inline def date_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/pro-utils/es/conversionMomentValue", "dateFormatterMap.time")
    @js.native
    def time: String = js.native
    
    @JSImport("@ant-design/pro-utils/es/conversionMomentValue", "dateFormatterMap.timeRange")
    @js.native
    def timeRange: String = js.native
    inline def timeRange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeRange")(x.asInstanceOf[js.Any])
    
    inline def time_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
  }
  
  inline def isPlainObject(o: Constructor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antDesignProUtils.antDesignProUtilsStrings.number
    - typings.antDesignProUtils.antDesignProUtilsStrings.string
    - js.Function2[
  / * value * / typings.dayjs.mod.Dayjs, 
  / * valueType * / java.lang.String, 
  java.lang.String | scala.Double]
    - typings.antDesignProUtils.antDesignProUtilsBooleans.`false`
  */
  type DateFormatter = _DateFormatter | (js.Function2[/* value */ Dayjs, /* valueType */ String, String | Double])
  
  trait _DateFormatter extends StObject
}
