package typings.ajvDashKeywords

import typings.ajv.ajvMod.Ajv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ajv-keywords", JSImport.Namespace)
@js.native
object ajvDashKeywordsMod extends js.Object {
  /**
    * Defines one or several keywords in ajv instance
    * @param  ajv validator instance
    * @param  keywords keyword(s) to define
    * @return ajv instance (for chaining)
    */
  def apply(ajv: Ajv): Ajv = js.native
  def apply(ajv: Ajv, keywords: String): Ajv = js.native
  def apply(ajv: Ajv, keywords: js.Array[String]): Ajv = js.native
}

