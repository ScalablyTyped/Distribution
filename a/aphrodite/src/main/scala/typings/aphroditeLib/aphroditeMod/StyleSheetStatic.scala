package typings
package aphroditeLib.aphroditeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StyleSheetStatic extends js.Object {
  /**
       * Create style sheet
       */
  def create[T /* <: StyleDeclaration */](styles: T): T
  /**
       * Rehydrate class names from server renderer
       */
  def rehydrate(renderedClassNames: js.Array[java.lang.String]): scala.Unit
}

