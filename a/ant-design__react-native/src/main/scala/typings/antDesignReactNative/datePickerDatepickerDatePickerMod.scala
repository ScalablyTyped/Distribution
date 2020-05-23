package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Cols
import typings.antDesignReactNative.anon.ColsValue
import typings.antDesignReactNative.anon.Date
import typings.antDesignReactNative.anon.DefaultDate
import typings.antDesignReactNative.anon.Key
import typings.antDesignReactNative.anon.Locale
import typings.antDesignReactNative.datePickerPropsMod.DatePickerProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/date-picker/datepicker/DatePicker", JSImport.Namespace)
@js.native
object datePickerDatepickerDatePickerMod extends js.Object {
  @js.native
  trait DatePicker
    extends Component[DatePickerProps, js.Any, js.Any] {
    var defaultMaxDate: js.Any = js.native
    var defaultMinDate: js.Any = js.native
    @JSName("state")
    var state_DatePicker: Date = js.native
    def clipDate(date: js.Any): js.Any = js.native
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MDatePicker(nextProps: DefaultDate): Unit = js.native
    def getDate(): js.Any = js.native
    def getDateData(): js.Array[Key] = js.native
    def getDefaultMaxDate(): js.Any = js.native
    def getDefaultMinDate(): js.Any = js.native
    def getDisplayHour(rawHour: Double): Double = js.native
    def getMaxDate(): js.Any = js.native
    def getMaxDay(): js.Any = js.native
    def getMaxHour(): js.Any = js.native
    def getMaxMinute(): js.Any = js.native
    def getMaxMonth(): js.Any = js.native
    def getMaxYear(): js.Any = js.native
    def getMinDate(): js.Any = js.native
    def getMinDay(): js.Any = js.native
    def getMinHour(): js.Any = js.native
    def getMinMinute(): js.Any = js.native
    def getMinMonth(): js.Any = js.native
    def getMinYear(): js.Any = js.native
    def getNewDate(values: js.Any, index: js.Any): js.Any = js.native
    def getTimeData(date: js.Any): Cols = js.native
    def getValue(): js.Any = js.native
    def getValueCols(): ColsValue = js.native
    def onScrollChange(values: js.Any, index: js.Any): Unit = js.native
    def onValueChange(values: js.Any, index: js.Any): Unit = js.native
    def setAmPm(date: js.Any, index: js.Any): Unit = js.native
    def setHours(date: typings.std.Date, hour: Double): Unit = js.native
  }
  
  @js.native
  class default () extends DatePicker
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Locale = js.native
  }
  
}

