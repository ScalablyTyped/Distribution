package typings.arangodb.ArangoDB

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
    val __obj = js.Dynamic.literal(alive = alive.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], compactionStatus = compactionStatus.asInstanceOf[js.Any], compactors = compactors.asInstanceOf[js.Any], datafiles = datafiles.asInstanceOf[js.Any], dead = dead.asInstanceOf[js.Any], documentReferences = documentReferences.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], journals = journals.asInstanceOf[js.Any], lastTick = lastTick.asInstanceOf[js.Any], shapefiles = shapefiles.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], uncollectedLogfileEntries = uncollectedLogfileEntries.asInstanceOf[js.Any], waitingFor = waitingFor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CollectionFigures]
  }
}

