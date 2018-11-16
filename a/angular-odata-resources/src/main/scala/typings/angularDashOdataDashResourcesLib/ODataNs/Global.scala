package typings
package angularDashOdataDashResourcesLib.ODataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OData.Global")
@js.native
class Global protected () extends js.Object {
  def this(ODataBinaryOperation: js.Any, ODataProvider: js.Any, ODataValue: js.Any, ODataProperty: js.Any, ODataMethodCall: js.Any, ODataPredicate: js.Any, ODataOrderByStatement: js.Any) = this()
  var BinaryOperation: ScalablyTyped.runtime.Instantiable3[
    /* propertyOrPredicate */ js.Any, 
    /* valueOrOperator */ js.UndefOr[/* valueOrOperator */ js.Any], 
    /* value */ js.UndefOr[/* value */ js.Any], 
    BinaryOperation
  ] = js.native
  var Func: ScalablyTyped.runtime.Instantiable2[/* methodName */ java.lang.String, /* args (repeated) */ js.Any, MethodCall] = js.native
  var OrderBy: ScalablyTyped.runtime.Instantiable2[
    /* propertyName */ java.lang.String, 
    /* sortOrder */ js.UndefOr[/* sortOrder */ java.lang.String], 
    OrderByStatement
  ] = js.native
  var Predicate: ScalablyTyped.runtime.Instantiable3[
    /* propertyOrValueOrPredicate */ js.Any, 
    /* valueOrOperator */ js.UndefOr[/* valueOrOperator */ js.Any], 
    /* value */ js.UndefOr[/* value */ js.Any], 
    Predicate
  ] = js.native
  var Property: ScalablyTyped.runtime.Instantiable1[/* value */ java.lang.String, Property] = js.native
  var Provider: Provider[_] = js.native
  var Value: ScalablyTyped.runtime.Instantiable2[/* value */ js.Any, /* type */ js.UndefOr[/* type */ java.lang.String], Value] = js.native
}

@JSGlobal("OData.Global")
@js.native
object Global extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[java.lang.String] = js.native
}

