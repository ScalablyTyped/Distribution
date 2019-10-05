package typings.alexaDashSdk.alexaDashSdkMod.templateBuilders

import typings.alexaDashSdk.alexaDashSdkMod.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to create BodyTemplate6 objects
  */
@JSImport("alexa-sdk", "templateBuilders.BodyTemplate6Builder")
@js.native
class BodyTemplate6Builder ()
  extends TemplateBuilder[BodyTemplate6Builder]
     with SetTextContent[BodyTemplate6Builder] {
  /**
    * Sets the image for the template
    * @param image image
    * @returns BodyTemplate6Builder
    */
  def setImage(image: Image): BodyTemplate6Builder = js.native
}

