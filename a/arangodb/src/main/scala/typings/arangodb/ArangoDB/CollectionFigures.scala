package typings.arangodb.ArangoDB

import typings.arangodb.AnonBytesRead
import typings.arangodb.AnonCount
import typings.arangodb.AnonCountDeletion
import typings.arangodb.AnonCountFileSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionFigures extends js.Object {
  var alive: AnonCount
  var attributes: AnonCount
  var compactionStatus: AnonBytesRead
  var compactors: AnonCountFileSize
  var datafiles: AnonCountFileSize
  var dead: AnonCountDeletion
  var documentReferences: Double
  var indexes: AnonCount
  var journals: AnonCountFileSize
  var lastTick: Double
  var shapefiles: AnonCountFileSize
  var shapes: AnonCount
  var uncollectedLogfileEntries: Double
  var waitingFor: String
}

object CollectionFigures {
  @scala.inline
  def apply(
    alive: AnonCount,
    attributes: AnonCount,
    compactionStatus: AnonBytesRead,
    compactors: AnonCountFileSize,
    datafiles: AnonCountFileSize,
    dead: AnonCountDeletion,
    documentReferences: Double,
    indexes: AnonCount,
    journals: AnonCountFileSize,
    lastTick: Double,
    shapefiles: AnonCountFileSize,
    shapes: AnonCount,
    uncollectedLogfileEntries: Double,
    waitingFor: String
  ): CollectionFigures = {
    val __obj = js.Dynamic.literal(alive = alive.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], compactionStatus = compactionStatus.asInstanceOf[js.Any], compactors = compactors.asInstanceOf[js.Any], datafiles = datafiles.asInstanceOf[js.Any], dead = dead.asInstanceOf[js.Any], documentReferences = documentReferences.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], journals = journals.asInstanceOf[js.Any], lastTick = lastTick.asInstanceOf[js.Any], shapefiles = shapefiles.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], uncollectedLogfileEntries = uncollectedLogfileEntries.asInstanceOf[js.Any], waitingFor = waitingFor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CollectionFigures]
  }
}

