package typings
package agDashGridLib.distLibFilterFloatingFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/floatingFilter", "SetFloatingFilterComp")
@js.native
class SetFloatingFilterComp ()
  extends InputTextFloatingFilterComp[
      agDashGridLib.distLibInterfacesISerializedSetFilterMod.SerializedSetFilter, 
      IFloatingFilterParams[
        agDashGridLib.distLibInterfacesISerializedSetFilterMod.SerializedSetFilter, 
        BaseFloatingFilterChange[agDashGridLib.distLibInterfacesISerializedSetFilterMod.SerializedSetFilter]
      ]
    ] {
  def asFloatingFilterText(parentModel: js.Array[java.lang.String]): java.lang.String = js.native
  def equalModels(
    left: agDashGridLib.distLibInterfacesISerializedSetFilterMod.SerializedSetFilter,
    right: agDashGridLib.distLibInterfacesISerializedSetFilterMod.SerializedSetFilter
  ): scala.Boolean = js.native
  @JSName("init")
  def init_MSetFloatingFilterComp(
    params: IFloatingFilterParams[
      agDashGridLib.distLibInterfacesISerializedSetFilterMod.SerializedSetFilter, 
      BaseFloatingFilterChange[agDashGridLib.distLibInterfacesISerializedSetFilterMod.SerializedSetFilter]
    ]
  ): scala.Unit = js.native
}

