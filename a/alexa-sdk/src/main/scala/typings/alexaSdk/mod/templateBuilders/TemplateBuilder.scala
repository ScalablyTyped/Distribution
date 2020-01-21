package typings.alexaSdk.mod.templateBuilders

import typings.alexaSdk.mod.Image
import typings.alexaSdk.mod.Template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Refer https://developer.amazon.com/docs/custom-skills/display-interface-reference.html#image-sizes
  */
@JSImport("alexa-sdk", "templateBuilders.TemplateBuilder")
@js.native
abstract class TemplateBuilder[T /* <: TemplateBuilder[T] */] () extends js.Object {
  var template: Template = js.native
  /**
    * Builds the template JSON object
    * @returns Template
    */
  def build(): Template = js.native
  /**
    * Sets the backButton behavior
    * @param backButtonBehavior "VISIBLE" or "HIDDEN"
    * @returns TemplateBuilder
    */
  def setBackButtonBehavior(backButtonBehavior: String): T = js.native
  /**
    * Sets the background image of the template
    * @param image image
    * @returns TemplateBuilder
    */
  def setBackgroundImage(image: Image): T = js.native
  /**
    * Sets the title of the template
    * @param title title
    * @returns TemplateBuilder
    */
  def setTitle(title: String): T = js.native
  /**
    * Sets the token of the template
    * @param token token
    * @returns TemplateBuilder
    */
  def setToken(token: String): T = js.native
}

