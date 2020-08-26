package typings.arangodb.ArangoDB

import typings.arangodb.anon.BytesRead
import typings.arangodb.anon.Count
import typings.arangodb.anon.Deletion
import typings.arangodb.anon.FileSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionFigures extends js.Object {
  var alive: Count = js.native
  var attributes: Count = js.native
  var compactionStatus: BytesRead = js.native
  var compactors: FileSize = js.native
  var datafiles: FileSize = js.native
  var dead: Deletion = js.native
  var documentReferences: Double = js.native
  var indexes: Count = js.native
  var journals: FileSize = js.native
  var lastTick: Double = js.native
  var shapefiles: FileSize = js.native
  var shapes: Count = js.native
  var uncollectedLogfileEntries: Double = js.native
  var waitingFor: String = js.native
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
  @scala.inline
  implicit class CollectionFiguresOps[Self <: CollectionFigures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlive(value: Count): Self = this.set("alive", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: Count): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompactionStatus(value: BytesRead): Self = this.set("compactionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompactors(value: FileSize): Self = this.set("compactors", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatafiles(value: FileSize): Self = this.set("datafiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setDead(value: Deletion): Self = this.set("dead", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentReferences(value: Double): Self = this.set("documentReferences", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexes(value: Count): Self = this.set("indexes", value.asInstanceOf[js.Any])
    @scala.inline
    def setJournals(value: FileSize): Self = this.set("journals", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastTick(value: Double): Self = this.set("lastTick", value.asInstanceOf[js.Any])
    @scala.inline
    def setShapefiles(value: FileSize): Self = this.set("shapefiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setShapes(value: Count): Self = this.set("shapes", value.asInstanceOf[js.Any])
    @scala.inline
    def setUncollectedLogfileEntries(value: Double): Self = this.set("uncollectedLogfileEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaitingFor(value: String): Self = this.set("waitingFor", value.asInstanceOf[js.Any])
  }
  
}

