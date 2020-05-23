package typings.arangodb.ArangoDB

import typings.arangodb.anon.BytesRead
import typings.arangodb.anon.Count
import typings.arangodb.anon.Deletion
import typings.arangodb.anon.FileSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionFigures extends js.Object {
  var alive: Count
  var attributes: Count
  var compactionStatus: BytesRead
  var compactors: FileSize
  var datafiles: FileSize
  var dead: Deletion
  var documentReferences: Double
  var indexes: Count
  var journals: FileSize
  var lastTick: Double
  var shapefiles: FileSize
  var shapes: Count
  var uncollectedLogfileEntries: Double
  var waitingFor: String
}

object CollectionFigures {
  @scala.inline
  def apply(
    alive: Count,
    attributes: Count,
    compactionStatus: BytesRead,
    compactors: FileSize,
    datafiles: FileSize,
    dead: Deletion,
    documentReferences: Double,
    indexes: Count,
    journals: FileSize,
    lastTick: Double,
    shapefiles: FileSize,
    shapes: Count,
    uncollectedLogfileEntries: Double,
    waitingFor: String
  ): CollectionFigures = {
    val __obj = js.Dynamic.literal(alive = alive.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], compactionStatus = compactionStatus.asInstanceOf[js.Any], compactors = compactors.asInstanceOf[js.Any], datafiles = datafiles.asInstanceOf[js.Any], dead = dead.asInstanceOf[js.Any], documentReferences = documentReferences.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], journals = journals.asInstanceOf[js.Any], lastTick = lastTick.asInstanceOf[js.Any], shapefiles = shapefiles.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], uncollectedLogfileEntries = uncollectedLogfileEntries.asInstanceOf[js.Any], waitingFor = waitingFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionFigures]
  }
}

