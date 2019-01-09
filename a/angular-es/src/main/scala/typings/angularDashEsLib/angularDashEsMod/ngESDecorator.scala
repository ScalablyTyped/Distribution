package typings
package angularDashEsLib.angularDashEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Decorated target
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- angularDashEsLib.angularDashEsMod.MethodDecorator because var conflicts: length. Inlined `<apply>` */ @js.native
trait ngESDecorator extends ClassDecorator {
  def apply(
    T0: /* target */ js.Object,
    T1: /* propertyKey */ java.lang.String | js.Symbol,
    T2: /* descriptor */ stdLib.TypedPropertyDescriptor[js.Any]
  ): stdLib.TypedPropertyDescriptor[js.Any] | scala.Unit = js.native
  def apply(target: js.Function, ngName: java.lang.String): scala.Unit = js.native
  def apply(target: js.Function, ngName: java.lang.String, ngArguments: js.Array[_]): scala.Unit = js.native
  def apply(target: js.Function, ngName: java.lang.String, ngArguments: js.Array[_], ngType: java.lang.String): scala.Unit = js.native
  def apply(
    target: js.Function,
    ngName: java.lang.String,
    ngArguments: js.Array[_],
    ngType: java.lang.String,
    injectAsProperty: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def apply(target: js.Object): scala.Unit = js.native
  def apply(target: js.Object, ngName: java.lang.String): scala.Unit = js.native
  def apply(target: js.Object, ngName: java.lang.String, ngArguments: js.Array[_]): scala.Unit = js.native
  def apply(target: js.Object, ngName: java.lang.String, ngArguments: js.Array[_], ngType: java.lang.String): scala.Unit = js.native
  def apply(
    target: js.Object,
    ngName: java.lang.String,
    ngArguments: js.Array[_],
    ngType: java.lang.String,
    injectAsProperty: js.Array[java.lang.String]
  ): scala.Unit = js.native
}

