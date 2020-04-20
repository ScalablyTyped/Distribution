package typings.angularCore.sourceFileExportsMod

import typings.typescript.mod.Identifier
import typings.typescript.mod.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedExport extends js.Object {
  var exportName: String
  var identifier: Identifier
  var symbol: Symbol
}

object ResolvedExport {
  @scala.inline
  def apply(exportName: String, identifier: Identifier, symbol: Symbol): ResolvedExport = {
    val __obj = js.Dynamic.literal(exportName = exportName.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedExport]
  }
}

