package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.imageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service specifies a HTML image map. */
trait ImageMap
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed

object ImageMap {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    Name: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getName: js.Function0[java.lang.String],
    hasElements: js.Function0[scala.Boolean],
    insertByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByIndex: js.Function1[scala.Double, scala.Unit],
    replaceByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit]
  ): ImageMap = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, Name = Name, acquire = acquire, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, getName = getName, hasElements = hasElements, insertByIndex = insertByIndex, queryInterface = queryInterface, release = release, removeByIndex = removeByIndex, replaceByIndex = replaceByIndex, setName = setName)
  
    __obj.asInstanceOf[ImageMap]
  }
}

