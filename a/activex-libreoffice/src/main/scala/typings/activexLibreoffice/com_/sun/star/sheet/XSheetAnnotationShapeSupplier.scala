package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to get the shape of o annotation
  * @see com.sun.star.sheet.CellAnnotation
  * @see com.sun.star.sheet.CellAnnotationShape
  */
trait XSheetAnnotationShapeSupplier
  extends StObject
     with XInterface {
  
  /** returns the shape of the annotation */
  val AnnotationShape: XShape
  
  /** returns the shape of the annotation */
  def getAnnotationShape(): XShape
}
object XSheetAnnotationShapeSupplier {
  
  inline def apply(
    AnnotationShape: XShape,
    acquire: () => Unit,
    getAnnotationShape: () => XShape,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XSheetAnnotationShapeSupplier = {
    val __obj = js.Dynamic.literal(AnnotationShape = AnnotationShape.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAnnotationShape = js.Any.fromFunction0(getAnnotationShape), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSheetAnnotationShapeSupplier]
  }
  
  extension [Self <: XSheetAnnotationShapeSupplier](x: Self) {
    
    inline def setAnnotationShape(value: XShape): Self = StObject.set(x, "AnnotationShape", value.asInstanceOf[js.Any])
    
    inline def setGetAnnotationShape(value: () => XShape): Self = StObject.set(x, "getAnnotationShape", js.Any.fromFunction0(value))
  }
}
