package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.image
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageMeshColor extends Accessor {
  /**
    * A direct reference to the image data. The image data can be an [image element](https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement), [canvas element](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement) or [ImageData](https://developer.mozilla.org/en-US/docs/Web/API/ImageData).  The data property is mutually exclusive with the url property, setting the data will clear the url (if there is one).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-ImageMeshColor.html#data)
    */
  var data: HTMLImageElement | HTMLCanvasElement | ImageData = js.native
  /**
    * Indicates whether the image data should be interpreted as being semi-transparent. The default value is automatically derived when the data property contains a canvas element or an ImageData object. If instead a url to a .png file was provided, it is assumed that transparency is present. In all other cases it defaults to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-ImageMeshColor.html#transparent)
    *
    * @default undefined
    */
  var transparent: Boolean = js.native
  /**
    * For ImageMeshColor the type is always `image`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-ImageMeshColor.html#type)
    */
  val `type`: image = js.native
  /**
    * The url to the image resource. This can either be a remote url (absolute or relative) or a data url.  The url property is mutually exclusive with the data property, setting the url will clear the data (if there is one).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-ImageMeshColor.html#url)
    */
  var url: String = js.native
}

@JSGlobal("__esri.ImageMeshColor")
@js.native
/**
  * ImageMeshColor is a type of mesh color that represents an image mapped to the mesh by its uv vertex attributes. ImageMeshColor instances can be used with the [MeshComponent.material.color](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#material) property. Images can be referred to either by url or directly by data ( [image element](https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement), [canvas element](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement) or [ImageData](https://developer.mozilla.org/en-US/docs/Web/API/ImageData)).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-ImageMeshColor.html)
  */
class ImageMeshColorCls () extends ImageMeshColor {
  def this(properties: ImageMeshColorProperties) = this()
}

