package typings.arangodb.ArangoDBNs

import typings.arangodb.Anon_BytesRead
import typings.arangodb.Anon_Count
import typings.arangodb.Anon_CountDeletion
import typings.arangodb.Anon_CountFileSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionFigures extends js.Object {
  var alive: Anon_Count
  var attributes: Anon_Count
  var compactionStatus: Anon_BytesRead
  var compactors: Anon_CountFileSize
  var datafiles: Anon_CountFileSize
  var dead: Anon_CountDeletion
  var documentReferences: Double
  var indexes: Anon_Count
  var journals: Anon_CountFileSize
  var lastTick: Double
  var shapefiles: Anon_CountFileSize
  var shapes: Anon_Count
  var uncollectedLogfileEntries: Double
  var waitingFor: String
}

object CollectionFigures {
  @scala.inline
  def apply(
    alive: Anon_Count,
    attributes: Anon_Count,
    compactionStatus: Anon_BytesRead,
    compactors: Anon_CountFileSize,
    datafiles: Anon_CountFileSize,
    dead: Anon_CountDeletion,
    documentReferences: Double,
    indexes: Anon_Count,
    journals: Anon_CountFileSize,
    lastTick: Double,
    shapefiles: Anon_CountFileSize,
    shapes: Anon_Count,
    uncollectedLogfileEntries: Double,
    waitingFor: String
  ): CollectionFigures = {
    val __obj = js.Dynamic.literal(alive = alive, attributes = attributes, compactionStatus = compactionStatus, compactors = compactors, datafiles = datafiles, dead = dead, documentReferences = documentReferences, indexes = indexes, journals = journals, lastTick = lastTick, shapefiles = shapefiles, shapes = shapes, uncollectedLogfileEntries = uncollectedLogfileEntries, waitingFor = waitingFor)
  
    __obj.asInstanceOf[CollectionFigures]
  }
}

