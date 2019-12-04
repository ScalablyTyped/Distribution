package typings.atAngularCore.schematicsMigrationsMoveDashDocumentDocumentUnderscoreImportUnderscoreVisitorMod

import typings.typescript.typescriptMod.ImportSpecifier
import typings.typescript.typescriptMod.NamedImports
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
    val __obj = js.Dynamic.literal()
    if (commonImport != null) __obj.updateDynamic("commonImport")(commonImport.asInstanceOf[js.Any])
    if (documentElement != null) __obj.updateDynamic("documentElement")(documentElement.asInstanceOf[js.Any])
    if (platformBrowserImport != null) __obj.updateDynamic("platformBrowserImport")(platformBrowserImport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedDocumentImport]
  }
}

