package typings.airtable.airtableMod.Global

import typings.airtable.airtableMod.Global.AirtableNs.AirtableOptions
import typings.airtable.airtableMod.Global.AirtableNs.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Airtable")
@js.native
class Airtable () extends js.Object {
  def this(options: AirtableOptions) = this()
  def base(appId: String): Base = js.native
}

