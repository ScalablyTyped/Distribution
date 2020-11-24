package typings.argparse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("argparse", "Action")
@js.native
abstract class Action protected () extends js.Object {
  def this(options: ActionConstructorOptions) = this()
  
  def call(parser: ArgumentParser, namespace: Namespace, values: String): Unit = js.native
  def call(parser: ArgumentParser, namespace: Namespace, values: String, optionString: String): Unit = js.native
  def call(parser: ArgumentParser, namespace: Namespace, values: js.Array[String]): Unit = js.native
  def call(parser: ArgumentParser, namespace: Namespace, values: js.Array[String], optionString: String): Unit = js.native
  
  var dest: String = js.native
}
