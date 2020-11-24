package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.java_.util.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.ArrayAdapter")
@js.native
class ArrayAdapter[T] protected ()
  extends typings.androiduix.android.widget.ArrayAdapter[T] {
  def this(context: Context, resource: String) = this()
  def this(context: Context, resource: String, objects: js.Array[T]) = this()
  def this(context: Context, resource: String, textViewResourceId: String) = this()
  def this(context: Context, resource: String, textViewResourceId: String, objects: js.Array[T]) = this()
  def this(context: Context, resource: String, textViewResourceId: String, objects: List[T]) = this()
}
