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
    val __obj = js.Dynamic.literal(alive = alive, attributes = attributes, compactionStatus = compactionStatus, compactors = compactors, datafiles = datafiles, dead = dead, documentReferences = documentReferences, indexes = indexes, journals = journals, lastTick = lastTick, shapefiles = shapefiles, shapes = shapes, uncollectedLogfileEntries = uncollectedLogfileEntries, waitingFor = waitingFor)
  
    __obj.asInstanceOf[CollectionFigures]
  }
}

