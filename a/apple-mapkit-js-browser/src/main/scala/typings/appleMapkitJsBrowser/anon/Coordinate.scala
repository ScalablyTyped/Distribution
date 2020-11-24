package typings.appleMapkitJsBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coordinate extends js.Object {
  
  var annotation: typings.appleMapkitJsBrowser.mapkit.Annotation = js.native
  
  var coordinate: typings.appleMapkitJsBrowser.mapkit.Coordinate = js.native
}
object Coordinate {
  
  @scala.inline
  def apply(
    annotation: typings.appleMapkitJsBrowser.mapkit.Annotation,
    coordinate: typings.appleMapkitJsBrowser.mapkit.Coordinate
  ): Coordinate = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinate]
  }
  
  @scala.inline
  implicit class CoordinateOps[Self <: Coordinate] (val x: Self) extends AnyVal {
    
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
    def setAnnotation(value: typings.appleMapkitJsBrowser.mapkit.Annotation): Self = this.set("annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinate(value: typings.appleMapkitJsBrowser.mapkit.Coordinate): Self = this.set("coordinate", value.asInstanceOf[js.Any])
  }
}
