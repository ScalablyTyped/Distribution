package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NumberFormatStyle extends StObject
@JSImport("@angular/common", "NumberFormatStyle")
@js.native
object NumberFormatStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NumberFormatStyle & Double] = js.native
  
  @js.native
  sealed trait Currency
    extends StObject
       with NumberFormatStyle
  /* 2 */ val Currency: typings.angularCommon.mod.NumberFormatStyle.Currency & Double = js.native
  
  @js.native
  sealed trait Decimal
    extends StObject
       with NumberFormatStyle
  /* 0 */ val Decimal: typings.angularCommon.mod.NumberFormatStyle.Decimal & Double = js.native
  
  @js.native
  sealed trait Percent
    extends StObject
       with NumberFormatStyle
  /* 1 */ val Percent: typings.angularCommon.mod.NumberFormatStyle.Percent & Double = js.native
  
  @js.native
  sealed trait Scientific
    extends StObject
       with NumberFormatStyle
  /* 3 */ val Scientific: typings.angularCommon.mod.NumberFormatStyle.Scientific & Double = js.native
}
