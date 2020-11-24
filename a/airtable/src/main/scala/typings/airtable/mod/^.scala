package typings.airtable.mod

import typings.airtable.mod.global.Airtable
import typings.airtable.mod.global.Airtable.AirtableOptions
import typings.airtable.mod.global.Airtable.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("airtable", JSImport.Namespace)
@js.native
class ^ () extends Airtable {
  def this(options: AirtableOptions) = this()
}
@JSImport("airtable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def base(appId: String): Base = js.native
  
  def configure(): Airtable = js.native
  def configure(options: AirtableOptions): Airtable = js.native
}
