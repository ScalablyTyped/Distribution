package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.com_.sun.star.geometry.AffineMatrix2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure contains information considered the view state.
  *
  * This structure contains information considered the view state, i.e. the invariant setup used when painting a whole view of something.
  * @since OOo 2.0
  */
@js.native
trait ViewState extends js.Object {
  
  /**
    * The affine transform associated with the view.
    *
    * This member is used to transform coordinates of draw operations from user space to screen space.
    */
  var AffineTransform: AffineMatrix2D = js.native
  
  /**
    * The clipping area associated with the view.
    *
    * This clipping is interpreted in the view coordinate systems, i.e. subject to the view transform before mapping to the device coordinate space.
    *
    * Specifying an empty interface denotes no clipping, i.e. everything rendered to the canvas will be visible (subject to device-dependent constraints, of
    * course). Specifying an empty {@link XPolyPolygon2D} , i.e. a poly-polygon containing zero polygons, or an {@link XPolyPolygon2D} with any number of
    * empty sub-polygons, denotes the NULL clip. That means, nothing rendered to the canvas will be visible.
    */
  var Clip: XPolyPolygon2D = js.native
}
object ViewState {
  
  @scala.inline
  def apply(AffineTransform: AffineMatrix2D, Clip: XPolyPolygon2D): ViewState = {
    val __obj = js.Dynamic.literal(AffineTransform = AffineTransform.asInstanceOf[js.Any], Clip = Clip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewState]
  }
  
  @scala.inline
  implicit class ViewStateOps[Self <: ViewState] (val x: Self) extends AnyVal {
    
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
    def setAffineTransform(value: AffineMatrix2D): Self = this.set("AffineTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClip(value: XPolyPolygon2D): Self = this.set("Clip", value.asInstanceOf[js.Any])
  }
}
