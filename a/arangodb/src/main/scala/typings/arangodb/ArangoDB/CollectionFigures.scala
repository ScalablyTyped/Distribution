package typings.arangodb.ArangoDB

import typings.arangodb.anon.BytesRead
import typings.arangodb.anon.Count
import typings.arangodb.anon.Deletion
import typings.arangodb.anon.FileSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionFigures extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: CollectionFigures](x: Self) {
    
    inline def setAlive(value: Count): Self = StObject.set(x, "alive", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: Count): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setCompactionStatus(value: BytesRead): Self = StObject.set(x, "compactionStatus", value.asInstanceOf[js.Any])
    
    inline def setCompactors(value: FileSize): Self = StObject.set(x, "compactors", value.asInstanceOf[js.Any])
    
    inline def setDatafiles(value: FileSize): Self = StObject.set(x, "datafiles", value.asInstanceOf[js.Any])
    
    inline def setDead(value: Deletion): Self = StObject.set(x, "dead", value.asInstanceOf[js.Any])
    
    inline def setDocumentReferences(value: Double): Self = StObject.set(x, "documentReferences", value.asInstanceOf[js.Any])
    
    inline def setIndexes(value: Count): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setJournals(value: FileSize): Self = StObject.set(x, "journals", value.asInstanceOf[js.Any])
    
    inline def setLastTick(value: Double): Self = StObject.set(x, "lastTick", value.asInstanceOf[js.Any])
    
    inline def setShapefiles(value: FileSize): Self = StObject.set(x, "shapefiles", value.asInstanceOf[js.Any])
    
    inline def setShapes(value: Count): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setUncollectedLogfileEntries(value: Double): Self = StObject.set(x, "uncollectedLogfileEntries", value.asInstanceOf[js.Any])
    
    inline def setWaitingFor(value: String): Self = StObject.set(x, "waitingFor", value.asInstanceOf[js.Any])
  }
}
