package typings.aphrodite.aphroditeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheetStatic extends js.Object {
  /**
    * Create style sheet
    */
  def create[T](styles: StyleDeclaration[T]): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: aphrodite.aphrodite.StyleDeclarationValue}
    */ typings.aphrodite.aphroditeStrings.StyleSheetStatic with js.Any
  def extend(extensions: js.Array[Extension]): Exports
  /**
    * Rehydrate class names from server renderer
    */
  def rehydrate(renderedClassNames: js.Array[String]): Unit
}

object StyleSheetStatic {
  @scala.inline
  def apply(
    create: StyleDeclaration[js.Any] => /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: aphrodite.aphrodite.StyleDeclarationValue}
    */ typings.aphrodite.aphroditeStrings.StyleSheetStatic with js.Any,
    extend: js.Array[Extension] => Exports,
    rehydrate: js.Array[String] => Unit
  ): StyleSheetStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), extend = js.Any.fromFunction1(extend), rehydrate = js.Any.fromFunction1(rehydrate))
  
    __obj.asInstanceOf[StyleSheetStatic]
  }
}

