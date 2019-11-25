package typings.aphrodite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aphroditeMod {
  import typings.aphrodite.aphroditeNumbers.`false`
  import typings.std.Map

  type CSSInputTypes = StyleDeclarationValue | `false` | Null | Unit
  type SelectorHandler = js.Function3[
    /* selector */ String, 
    /* baseSelector */ String, 
    /* callback */ js.Function1[/* selector */ String, String], 
    String | Null
  ]
  type StyleDeclaration[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: aphrodite.aphrodite/typings/css-properties.CSSProperties | aphrodite.aphrodite.StyleDeclarationMap}
    */ typings.aphrodite.aphroditeStrings.StyleDeclaration with js.Any
  type StyleDeclarationMap = Map[String, String | Double]
  type StyleDeclarationValue = js.Object
}
