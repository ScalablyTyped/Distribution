package typings.agGrid.mod

import typings.agGrid.iFilterMod.IFilterParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "BaseFilter")
@js.native
abstract class BaseFilter[T, P /* <: IFilterParams */, M] ()
  extends typings.agGrid.baseFilterMod.BaseFilter[T, P, M] {
  def this(template: String) = this()
}
/* static members */
object BaseFilter {
  
  @JSImport("ag-grid", "BaseFilter")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid", "BaseFilter.CONTAINS")
  @js.native
  def CONTAINS: String = js.native
  inline def CONTAINS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTAINS")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "BaseFilter.ENDS_WITH")
  @js.native
  def ENDS_WITH: String = js.native
  inline def ENDS_WITH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENDS_WITH")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "BaseFilter.EQUALS")
  @js.native
  def EQUALS: String = js.native
  inline def EQUALS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EQUALS")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "BaseFilter.GREATER_THAN")
  @js.native
  def GREATER_THAN: String = js.native
  inline def GREATER_THAN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREATER_THAN")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "BaseFilter.GREATER_THAN_OR_EQUAL")
  @js.native
  def GREATER_THAN_OR_EQUAL: String = js.native
  inline def GREATER_THAN_OR_EQUAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREATER_THAN_OR_EQUAL")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "BaseFilter.IN_RANGE")
  @js.native
  def IN_RANGE: String = js.native
  inline def IN_RANGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IN_RANGE")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "BaseFilter.LESS_THAN")
  @js.native
  def LESS_THAN: String = js.native
  inline def LESS_THAN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LESS_THAN")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "BaseFilter.LESS_THAN_OR_EQUAL")
  @js.native
  def LESS_THAN_OR_EQUAL: String = js.native
  inline def LESS_THAN_OR_EQUAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LESS_THAN_OR_EQUAL")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "BaseFilter.NOT_CONTAINS")
  @js.native
  def NOT_CONTAINS: String = js.native
  inline def NOT_CONTAINS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_CONTAINS")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "BaseFilter.NOT_EQUAL")
  @js.native
  def NOT_EQUAL: String = js.native
  inline def NOT_EQUAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_EQUAL")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "BaseFilter.STARTS_WITH")
  @js.native
  def STARTS_WITH: String = js.native
  inline def STARTS_WITH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STARTS_WITH")(x.asInstanceOf[js.Any])
}
