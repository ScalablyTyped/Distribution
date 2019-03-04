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
    item: js.Function1[
      scala.Double, 
      stdLib.Element | (aframeLib.aframeMod.Entity[
        aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
      ])
    ],
    iterator: js.Function0[stdLib.IterableIterator[stdLib.Element]],
    length: scala.Double,
    namedItem: js.Function1[
      java.lang.String, 
      stdLib.Element | (aframeLib.aframeMod.Entity[
        aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
      ]) | scala.Null
    ]
  ): HTMLCollection = {
    val __obj = js.Dynamic.literal(item = item, iterator = iterator, length = length, namedItem = namedItem)
  
    __obj.asInstanceOf[HTMLCollection]
  }
}

