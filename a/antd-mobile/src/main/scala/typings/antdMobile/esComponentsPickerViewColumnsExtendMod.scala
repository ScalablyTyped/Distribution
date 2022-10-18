package typings.antdMobile

import typings.antdMobile.esComponentsPickerViewPickerViewMod.PickerColumn
import typings.antdMobile.esComponentsPickerViewPickerViewMod.PickerValue
import typings.antdMobile.esComponentsPickerViewPickerViewMod.PickerValueExtend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsPickerViewColumnsExtendMod {
  
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
