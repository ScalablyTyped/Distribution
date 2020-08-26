package typings.aphrodite.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleSheetStatic extends js.Object {
  /**
    * Create style sheet
    */
  def create[T](styles: StyleDeclaration[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: aphrodite.aphrodite.StyleDeclarationValue}
    */ typings.aphrodite.aphroditeStrings.StyleSheetStatic with TopLevel[js.Any] = js.native
  def extend(extensions: js.Array[Extension]): Exports = js.native
  /**
    * Rehydrate class names from server renderer
    */
  def rehydrate(renderedClassNames: js.Array[String]): Unit = js.native
}

object StyleSheetStatic {
  @scala.inline
  def apply(
    create: StyleDeclaration[js.Any] => /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: aphrodite.aphrodite.StyleDeclarationValue}
    */ typings.aphrodite.aphroditeStrings.StyleSheetStatic with TopLevel[js.Any],
    extend: js.Array[Extension] => Exports,
    rehydrate: js.Array[String] => Unit
  ): StyleSheetStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), extend = js.Any.fromFunction1(extend), rehydrate = js.Any.fromFunction1(rehydrate))
    __obj.asInstanceOf[StyleSheetStatic]
  }
  @scala.inline
  implicit class StyleSheetStaticOps[Self <: StyleSheetStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(
      value: StyleDeclaration[js.Any] => /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]: aphrodite.aphrodite.StyleDeclarationValue}
      */ typings.aphrodite.aphroditeStrings.StyleSheetStatic with TopLevel[js.Any]
    ): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setExtend(value: js.Array[Extension] => Exports): Self = this.set("extend", js.Any.fromFunction1(value))
    @scala.inline
    def setRehydrate(value: js.Array[String] => Unit): Self = this.set("rehydrate", js.Any.fromFunction1(value))
  }
  
}

