package typings.angularCompiler.jitCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleWithComponentFactories extends js.Object {
  var componentFactories: js.Array[js.Object]
  var ngModuleFactory: js.Object
}

object ModuleWithComponentFactories {
  @scala.inline
  def apply(componentFactories: js.Array[js.Object], ngModuleFactory: js.Object): ModuleWithComponentFactories = {
    val __obj = js.Dynamic.literal(componentFactories = componentFactories.asInstanceOf[js.Any], ngModuleFactory = ngModuleFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleWithComponentFactories]
  }
}

