package typings.angularOdataResources.OData

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.angularOdataResources.TypeofClassPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OData.Global")
@js.native
class Global protected () extends js.Object {
  def this(
    ODataBinaryOperation: js.Any,
    ODataProvider: js.Any,
    ODataValue: js.Any,
    ODataProperty: js.Any,
    ODataMethodCall: js.Any,
    ODataPredicate: js.Any,
    ODataOrderByStatement: js.Any
  ) = this()
  var BinaryOperation: Instantiable3[
    /* propertyOrPredicate */ js.Any, 
    js.UndefOr[/* valueOrOperator */ js.Any], 
    js.UndefOr[/* value */ js.Any], 
    typings.angularOdataResources.OData.BinaryOperation
  ] = js.native
  var Func: Instantiable2[/* methodName */ String, /* args (repeated) */ js.Any, MethodCall] = js.native
  var OrderBy: Instantiable2[/* propertyName */ String, js.UndefOr[/* sortOrder */ String], OrderByStatement] = js.native
  var Predicate: TypeofClassPredicate = js.native
  var Property: Instantiable1[/* value */ String, typings.angularOdataResources.OData.Property] = js.native
  var Provider: typings.angularOdataResources.OData.Provider[_] = js.native
  var Value: Instantiable2[
    /* value */ js.Any, 
    js.UndefOr[/* type */ String], 
    typings.angularOdataResources.OData.Value
  ] = js.native
}

/* static members */
@JSGlobal("OData.Global")
@js.native
object Global extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[String] = js.native
}

