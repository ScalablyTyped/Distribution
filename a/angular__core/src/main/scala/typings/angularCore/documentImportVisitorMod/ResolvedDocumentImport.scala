package typings.angularCore.documentImportVisitorMod

import typings.typescript.mod.ImportSpecifier
import typings.typescript.mod.NamedImports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedDocumentImport extends js.Object {
  var commonImport: NamedImports | Null
  var documentElement: ImportSpecifier | Null
  var platformBrowserImport: NamedImports | Null
}

object ResolvedDocumentImport {
  @scala.inline
  def apply(
    commonImport: NamedImports = null,
    documentElement: ImportSpecifier = null,
    platformBrowserImport: NamedImports = null
  ): ResolvedDocumentImport = {
    val __obj = js.Dynamic.literal(commonImport = commonImport.asInstanceOf[js.Any], documentElement = documentElement.asInstanceOf[js.Any], platformBrowserImport = platformBrowserImport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedDocumentImport]
  }
}

