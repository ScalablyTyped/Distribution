package typings.angularUiRouter.mod

import typings.uirouterCore.libParamsInterfaceMod.RawParams
import typings.uirouterCore.libStateInterfaceMod.StateDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("angular-ui-router", "Param")
@js.native
open class Param protected ()
  extends typings.uirouterCore.mod.Param {
  def this(
    id: String,
    `type`: typings.uirouterCore.libParamsParamTypeMod.ParamType,
    location: typings.uirouterCore.libParamsParamMod.DefType,
    urlConfig: typings.uirouterCore.libUrlMod.UrlConfig,
    state: StateDeclaration
  ) = this()
}
/* static members */
object Param {
  
  @JSImport("angular-ui-router", "Param")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Finds [[Param]] objects which have different param values
    *
    * Filters a list of [[Param]] objects to only those whose parameter values differ in two param value objects
    *
    * @param params: The list of Param objects to filter
    * @param values1: The first set of parameter values
    * @param values2: the second set of parameter values
    *
    * @returns any Param objects whose values were different between values1 and values2
    */
  inline def changed(params: js.Array[typings.uirouterCore.libParamsParamMod.Param]): js.Array[typings.uirouterCore.libParamsParamMod.Param] = ^.asInstanceOf[js.Dynamic].applyDynamic("changed")(params.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.uirouterCore.libParamsParamMod.Param]]
  inline def changed(params: js.Array[typings.uirouterCore.libParamsParamMod.Param], values1: Unit, values2: RawParams): js.Array[typings.uirouterCore.libParamsParamMod.Param] = (^.asInstanceOf[js.Dynamic].applyDynamic("changed")(params.asInstanceOf[js.Any], values1.asInstanceOf[js.Any], values2.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.uirouterCore.libParamsParamMod.Param]]
  inline def changed(params: js.Array[typings.uirouterCore.libParamsParamMod.Param], values1: RawParams): js.Array[typings.uirouterCore.libParamsParamMod.Param] = (^.asInstanceOf[js.Dynamic].applyDynamic("changed")(params.asInstanceOf[js.Any], values1.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.uirouterCore.libParamsParamMod.Param]]
  inline def changed(
    params: js.Array[typings.uirouterCore.libParamsParamMod.Param],
    values1: RawParams,
    values2: RawParams
  ): js.Array[typings.uirouterCore.libParamsParamMod.Param] = (^.asInstanceOf[js.Dynamic].applyDynamic("changed")(params.asInstanceOf[js.Any], values1.asInstanceOf[js.Any], values2.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.uirouterCore.libParamsParamMod.Param]]
  
  /**
    * Checks if two param value objects are equal (for a set of [[Param]] objects)
    *
    * @param params The list of [[Param]] objects to check
    * @param values1 The first set of param values
    * @param values2 The second set of param values
    *
    * @returns true if the param values in values1 and values2 are equal
    */
  inline def equals(params: js.Array[typings.uirouterCore.libParamsParamMod.Param]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(params.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(params: js.Array[typings.uirouterCore.libParamsParamMod.Param], values1: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(params.asInstanceOf[js.Any], values1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(
    params: js.Array[typings.uirouterCore.libParamsParamMod.Param],
    values1: js.Object,
    values2: js.Object
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(params.asInstanceOf[js.Any], values1.asInstanceOf[js.Any], values2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(params: js.Array[typings.uirouterCore.libParamsParamMod.Param], values1: Unit, values2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(params.asInstanceOf[js.Any], values1.asInstanceOf[js.Any], values2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** Returns true if a the parameter values are valid, according to the Param definitions */
  inline def validates(params: js.Array[typings.uirouterCore.libParamsParamMod.Param]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validates")(params.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def validates(params: js.Array[typings.uirouterCore.libParamsParamMod.Param], values: RawParams): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validates")(params.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def values(params: js.Array[typings.uirouterCore.libParamsParamMod.Param]): RawParams = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(params.asInstanceOf[js.Any]).asInstanceOf[RawParams]
  inline def values(params: js.Array[typings.uirouterCore.libParamsParamMod.Param], values: RawParams): RawParams = (^.asInstanceOf[js.Dynamic].applyDynamic("values")(params.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[RawParams]
}
