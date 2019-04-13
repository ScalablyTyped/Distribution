package typings
package atAngularCoreLib.srcUtilDecoratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/util/decorators", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ANNOTATIONS: atAngularCoreLib.atAngularCoreLibStrings.__annotations__ = js.native
  val PARAMETERS: atAngularCoreLib.atAngularCoreLibStrings.__parameters__ = js.native
  val PROP_METADATA: atAngularCoreLib.atAngularCoreLibStrings.__prop__metadata__ = js.native
  def makeDecorator[T](name: java.lang.String): atAngularCoreLib.Anon_Args = js.native
  def makeDecorator[T](name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _]): atAngularCoreLib.Anon_Args = js.native
  def makeDecorator[T](name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): atAngularCoreLib.Anon_Args = js.native
  def makeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ atAngularCoreLib.srcTypeMod.Type[T], scala.Unit]
  ): atAngularCoreLib.Anon_Args = js.native
  def makeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ atAngularCoreLib.srcTypeMod.Type[T], scala.Unit],
    typeFn: js.Function2[/* type */ atAngularCoreLib.srcTypeMod.Type[T], /* repeated */ js.Any, scala.Unit]
  ): atAngularCoreLib.Anon_Args = js.native
  def makeParamDecorator(name: java.lang.String): js.Any = js.native
  def makeParamDecorator(name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def makeParamDecorator(name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): js.Any = js.native
  def makePropDecorator(name: java.lang.String): js.Any = js.native
  def makePropDecorator(name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def makePropDecorator(name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): js.Any = js.native
  def makePropDecorator(
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function3[/* target */ js.Any, /* name */ java.lang.String, /* repeated */ js.Any, scala.Unit]
  ): js.Any = js.native
}

