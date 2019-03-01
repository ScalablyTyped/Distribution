package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionFigures extends js.Object {
  var alive: arangodbLib.Anon_Count
  var attributes: arangodbLib.Anon_Count
  var compactionStatus: arangodbLib.Anon_BytesRead
  var compactors: arangodbLib.Anon_CountFileSize
  var datafiles: arangodbLib.Anon_CountFileSize
  var dead: arangodbLib.Anon_CountDeletion
  var documentReferences: scala.Double
  var indexes: arangodbLib.Anon_Count
  var journals: arangodbLib.Anon_CountFileSize
  var lastTick: scala.Double
  var shapefiles: arangodbLib.Anon_CountFileSize
  var shapes: arangodbLib.Anon_Count
  var uncollectedLogfileEntries: scala.Double
  var waitingFor: java.lang.String
}

object CollectionFigures {
  @scala.inline
  def apply(
    alive: arangodbLib.Anon_Count,
    attributes: arangodbLib.Anon_Count,
    compactionStatus: arangodbLib.Anon_BytesRead,
    compactors: arangodbLib.Anon_CountFileSize,
    datafiles: arangodbLib.Anon_CountFileSize,
    dead: arangodbLib.Anon_CountDeletion,
    documentReferences: scala.Double,
    indexes: arangodbLib.Anon_Count,
    journals: arangodbLib.Anon_CountFileSize,
    lastTick: scala.Double,
    shapefiles: arangodbLib.Anon_CountFileSize,
    shapes: arangodbLib.Anon_Count,
    uncollectedLogfileEntries: scala.Double,
    waitingFor: java.lang.String
  ): CollectionFigures = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alive")(alive)
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("compactionStatus")(compactionStatus)
    __obj.updateDynamic("compactors")(compactors)
    __obj.updateDynamic("datafiles")(datafiles)
    __obj.updateDynamic("dead")(dead)
    __obj.updateDynamic("documentReferences")(documentReferences)
    __obj.updateDynamic("indexes")(indexes)
    __obj.updateDynamic("journals")(journals)
    __obj.updateDynamic("lastTick")(lastTick)
    __obj.updateDynamic("shapefiles")(shapefiles)
    __obj.updateDynamic("shapes")(shapes)
    __obj.updateDynamic("uncollectedLogfileEntries")(uncollectedLogfileEntries)
    __obj.updateDynamic("waitingFor")(waitingFor)
    __obj.asInstanceOf[CollectionFigures]
  }
}

