package typings
package aframeLib.aframeMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLCollection
  extends stdLib.HTMLCollectionBase {
  /**
  		 * Retrieves a select object or an object from an options collection.
  		 */
  def namedItem(name: java.lang.String): stdLib.Element | (aframeLib.aframeMod.Entity[
    aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
  ]) | scala.Null
}

object HTMLCollection {
  @scala.inline
  def apply(
    item: scala.Double => stdLib.Element | (aframeLib.aframeMod.Entity[
      aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
    ]),
    iterator: () => stdLib.IterableIterator[stdLib.Element],
    length: scala.Double,
    namedItem: java.lang.String => stdLib.Element | (aframeLib.aframeMod.Entity[
      aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
    ]) | scala.Null
  ): HTMLCollection = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), iterator = js.Any.fromFunction0(iterator), length = length, namedItem = js.Any.fromFunction1(namedItem))
  
    __obj.asInstanceOf[HTMLCollection]
  }
}

