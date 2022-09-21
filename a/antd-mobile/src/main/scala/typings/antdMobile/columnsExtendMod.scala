package typings.antdMobile

import typings.antdMobile.pickerViewPickerViewMod.PickerColumn
import typings.antdMobile.pickerViewPickerViewMod.PickerValue
import typings.antdMobile.pickerViewPickerViewMod.PickerValueExtend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnsExtendMod {
  
  @JSImport("antd-mobile/es/components/picker-view/columns-extend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateColumnsExtend(rawColumns: js.Array[PickerColumn], `val`: js.Array[PickerValue]): PickerValueExtend = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColumnsExtend")(rawColumns.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[PickerValueExtend]
  inline def generateColumnsExtend(
    rawColumns: js.Function1[/* value */ js.Array[PickerValue], js.Array[PickerColumn]],
    `val`: js.Array[PickerValue]
  ): PickerValueExtend = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColumnsExtend")(rawColumns.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[PickerValueExtend]
  
  inline def useColumnsExtend(rawColumns: js.Array[PickerColumn], value: js.Array[PickerValue]): PickerValueExtend = (^.asInstanceOf[js.Dynamic].applyDynamic("useColumnsExtend")(rawColumns.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[PickerValueExtend]
  inline def useColumnsExtend(
    rawColumns: js.Function1[/* value */ js.Array[PickerValue], js.Array[PickerColumn]],
    value: js.Array[PickerValue]
  ): PickerValueExtend = (^.asInstanceOf[js.Dynamic].applyDynamic("useColumnsExtend")(rawColumns.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[PickerValueExtend]
}
