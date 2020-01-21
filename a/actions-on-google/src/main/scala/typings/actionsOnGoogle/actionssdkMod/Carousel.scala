package typings.actionsOnGoogle.actionssdkMod

import typings.actionsOnGoogle.carouselMod.CarouselOptions
import typings.actionsOnGoogle.incomingMod._IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "Carousel")
@js.native
class Carousel protected ()
  extends typings.actionsOnGoogle.conversationMod.Carousel
     with _IncomingMessage {
  /**
    * @param options Carousel option
    * @public
    */
  def this(options: CarouselOptions) = this()
}

