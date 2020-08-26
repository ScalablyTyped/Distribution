package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`line-through`
import typings.arcgisJsApi.arcgisJsApiStrings.bold
import typings.arcgisJsApi.arcgisJsApiStrings.bolder
import typings.arcgisJsApi.arcgisJsApiStrings.italic
import typings.arcgisJsApi.arcgisJsApiStrings.lighter
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.normal
import typings.arcgisJsApi.arcgisJsApiStrings.oblique
import typings.arcgisJsApi.arcgisJsApiStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Font
  extends Accessor
     with JSONSupport {
  /**
    * The text decoration.
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#decoration)
    *
    * @default none
    */
  var decoration: underline | `line-through` | none = js.native
  /**
    * The font family of the text. The possible values are dependent upon the layer type, and if you working with a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [Labeling guide page](https://developers.arcgis.com/javascript/latest/guide/labeling/index.html) for detailed explanation, or click the `Read more` below.  >>> esri-read-more **Font families for 3D SceneViews**  The supported font families for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) are dependent upon the fonts installed on the user's computer and web browser. If an app uses a font that is not installed, the Font class implements a fallback mechanism that will use the default font family value, which is `sans-serif`.  **Font families for 2D MapImageLayer**  The supported font families for [MapImageLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html) in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) are dependent upon the fonts installed on the [ArcGIS Server](http://enterprise.arcgis.com/en/server/latest/get-started/windows/what-is-arcgis-for-server-.htm) that published the layer. If an app uses a font that is not installed, the Font class implements a fallback mechanism that will use the default font family value, which is `sans-serif`.  **Font families for 2D FeatureLayer**, CSVLayer, StreamLayer, and TextSymbol  The supported font families are based on hosted fonts files in `.pbf` format. By default, the fonts available are mostly the same ones used by the Esri Vector Basemaps. These fonts are available via `https://static.arcgis.com/fonts`. The URL can be configured to point to your own font resources by setting the [esriConfig.fontsUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#fontsUrl) property. If an app uses a font that is not installed, the Font class implements a fallback mechanism that will use the default font family value, which is `sans-serif`. This uses the `Arial Unicode MS` font file.  List of currently supported fonts:
    *
    * | Font           | Style            | Weight        | Code Snippet
    * |----------------|------------------|---------------|------------------------------------------------------------------
    * | Abril Fatface Regular | normal | normal | font: { family: 'Abril Fatface', style: 'normal', weight: 'normal' }
    * | Alegreya Bold | normal | bold | font: { family: 'Alegreya', style: 'normal', weight: 'bold' }
    * | Alegreya Bold Italic | italic | bold | font: { family: 'Alegreya', style: 'italic', weight: 'bold' }
    * | Alegreya Italic | italic | normal | font: { family: 'Alegreya', style: 'italic', weight: 'normal' }
    * | Alegreya Regular | normal | normal | font: { family: 'Alegreya', style: 'normal', weight: 'normal' }
    * | Alegreya Sans Italic | italic | normal | font: { family: 'Alegreya Sans', style: 'italic', weight: 'normal' }
    * | Alegreya SC Bold | normal | bold | font: { family: 'Alegreya SC', style: 'normal', weight: 'bold' }
    * | Alegreya SC Italic | italic | normal | font: { family: 'Alegreya SC', style: 'italic', weight: 'normal' }
    * | Alegreya SC Regular | normal | normal | font: { family: 'Alegreya SC', style: 'normal', weight: 'normal' }
    * | Amarante Regular | normal | normal | font: { family: 'Amarante', style: 'normal', weight: 'normal' }
    * | Amatic SC Bold | normal | bold | font: { family: 'Amatic SC', style: 'normal', weight: 'bold' }
    * | Arial Bold | normal | bold | font: { family: 'Arial', style: 'normal', weight: 'bold' }
    * | Arial Bold Italic | italic | bold | font: { family: 'Arial', style: 'italic', weight: 'bold' }
    * | Arial Italic | italic | normal | font: { family: 'Arial', style: 'italic', weight: 'normal' }
    * | Arial Regular | normal | normal | font: { family: 'Arial', style: 'normal', weight: 'normal' }
    * | Arial Unicode MS Bold | normal | bold | font: { family: 'Arial Unicode MS', style: 'normal', weight: 'bold' }
    * | Arial Unicode MS Regular | normal | normal | font: { family: 'Arial Unicode MS', style: 'normal', weight: 'normal' }
    * | Atomic Age Regular | normal | normal | font: { family: 'Atomic Age', style: 'normal', weight: 'normal' }
    * | Audiowide Regular | normal | normal | font: { family: 'Audiowide', style: 'normal', weight: 'normal' }
    * | Avenir Next LT Pro Bold | normal | bold | font: { family: 'Avenir Next LT Pro', style: 'normal', weight: 'bold' }
    * | Avenir Next LT Pro Bold Italic | italic | bold | font: { family: 'Avenir Next LT Pro', style: 'italic', weight: 'bold' }
    * | Avenir Next LT Pro Demi Italic | italic | normal | font: { family: 'Avenir Next LT Pro Demi', style: 'italic', weight: 'normal' }
    * | Avenir Next LT Pro Italic | italic | normal | font: { family: 'Avenir Next LT Pro', style: 'italic', weight: 'normal' }
    * | Avenir Next LT Pro Light Italic | italic | normal | font: { family: 'Avenir Next LT Pro Light', style: 'italic', weight: 'normal' }
    * | Avenir Next LT Pro Regular | normal | normal | font: { family: 'Avenir Next LT Pro', style: 'normal', weight: 'normal' }
    * | Avenir Next LT Pro Light Italic | italic | normal | font: { family: 'Avenir Next LT Pro Light', style: 'italic', weight: 'normal' }
    * | Avenir Next LT Pro Light Regular | normal | normal | font: { family: 'Avenir Next LT Pro Light', style: 'normal', weight: 'normal' }
    * | Avenir Next LT Pro Medium Bold | normal | bold | font: { family: 'Avenir Next LT Pro Medium', style: 'normal', weight: 'bold' }
    * | Avenir Next LT Pro Medium Bold Italic | italic | bold | font: { family: 'Avenir Next LT Pro Medium', style: 'italic', weight: 'bold' }
    * | Avenir Next LT Pro Regular Bold | normal | bold | font: { family: 'Avenir Next LT Pro Regular', style: 'normal', weight: 'bold' }
    * | Avenir Next LT Pro Regular Bold Italic | italic | bold | font: { family: 'Avenir Next LT Pro Regular', style: 'italic', weight: 'bold' }
    * | Avenir Next LT Pro Regular Italic | italic | normal | font: { family: 'Avenir Next LT Pro Regular', style: 'italic', weight: 'normal' }
    * | Avenir Next LT Pro Regular Regular | normal | normal | font: { family: 'Avenir Next LT Pro Regular', style: 'normal', weight: 'normal' }
    * | Belleza Regular | normal | normal | font: { family: 'Belleza', style: 'normal', weight: 'normal' }
    * | Black Ops One Regular | normal | normal | font: { family: 'Black Ops One', style: 'normal', weight: 'normal' }
    * | Cabin Sketch Bold | normal | bold | font: { family: 'Cabin Sketch', style: 'normal', weight: 'bold' }
    * | Cabin Sketch Regular | normal | normal | font: { family: 'Cabin Sketch', style: 'normal', weight: 'normal' }
    * | Coming Soon Regular | normal | normal | font: { family: 'Coming Soon', style: 'normal', weight: 'normal' }
    * | Esri Icon Font | normal | normal | font: { family: 'CalciteWebCoreIcons', style: 'normal', weight: 'normal' }
    * | Homemade Apple Regular | normal | normal | font: { family: 'Homemade Apple', style: 'normal', weight: 'normal' }
    * | IM FELL DW Pica PRO Italic | italic | normal | font: { family: 'IM FELL DW Pica PRO', style: 'italic', weight: 'normal' }
    * | IM FELL DW Pica PRO Regular | normal | normal | font: { family: 'IM FELL DW Pica PRO', style: 'normal', weight: 'normal' }
    * | Josefin Sans Regular | normal | normal | font: { family: 'Josefin Sans', style: 'normal', weight: 'normal' }
    * | Josefin Sans Semibold Italic | italic | normal | font: { family: 'Josefin Sans Semibold', style: 'italic', weight: 'normal' }
    * | Josefin Slab Bold | normal | bold | font: { family: 'Josefin Slab', style: 'normal', weight: 'bold' }
    * | Josefin Slab Bold Italic | italic | bold | font: { family: 'Josefin Slab', style: 'italic', weight: 'bold' }
    * | Josefin Slab Italic | italic | normal | font: { family: 'Josefin Slab', style: 'italic', weight: 'normal' }
    * | Josefin Slab Light Italic | italic | normal | font: { family: 'Josefin Slab Light', style: 'italic', weight: 'normal' }
    * | Josefin Slab Regular | normal | normal | font: { family: 'Josefin Slab', style: 'normal', weight: 'normal' }
    * | Josefin Slab Semibold Italic | italic | normal | font: { family: 'Josefin Slab Semibold', style: 'italic', weight: 'normal' }
    * | Josefin Slab Thin Italic | italic | normal | font: { family: 'Josefin Slab Thin', style: 'italic', weight: 'normal' }
    * | Just Another Hand Regular | normal | normal | font: { family: 'Just Another Hand', style: 'normal', weight: 'normal' }
    * | Kranky Regular | normal | normal | font: { family: 'Kranky', style: 'normal', weight: 'normal' }
    * | Life Savers Bold | normal | bold | font: { family: 'Life Savers', style: 'normal', weight: 'bold' }
    * | Loved By The King Regular | normal | normal | font: { family: 'Loved By The King', style: 'normal', weight: 'normal' }
    * | Merriweather Bold | normal | bold | font: { family: 'Merriweather', style: 'normal', weight: 'bold' }
    * | Merriweather Bold Italic | italic | bold | font: { family: 'Merriweather', style: 'italic', weight: 'bold' }
    * | Merriweather Italic | italic | normal | font: { family: 'Merriweather', style: 'italic', weight: 'normal' }
    * | Merriweather Regular | normal | normal | font: { family: 'Merriweather', style: 'normal', weight: 'normal' }
    * | Montserrat Bold | normal | bold | font: { family: 'Montserrat', style: 'normal', weight: 'bold' }
    * | Montserrat Italic | italic | normal | font: { family: 'Montserrat', style: 'italic', weight: 'normal' }
    * | Montserrat Medium Italic | italic | normal | font: { family: 'Montserrat Medium', style: 'italic', weight: 'normal' }
    * | Montserrat Regular | normal | normal | font: { family: 'Montserrat', style: 'normal', weight: 'normal' }
    * | Montserrat Semibold Italic | italic | normal | font: { family: 'Montserrat Semibold', style: 'italic', weight: 'normal' }
    * | Noto Sans Bold | normal | bold | font: { family: 'Noto Sans', style: 'normal', weight: 'bold' }
    * | Noto Sans Bold Italic | italic | bold | font: { family: 'Noto Sans', style: 'italic', weight: 'bold' }
    * | Noto Sans Italic | italic | normal | font: { family: 'Noto Sans', style: 'italic', weight: 'normal' }
    * | Noto Sans Regular | normal | normal | font: { family: 'Noto Sans', style: 'normal', weight: 'normal' }
    * | Noto Serif Bold | normal | bold | font: { family: 'Noto Serif', style: 'normal', weight: 'bold' }
    * | Noto Serif Bold Italic | italic | bold | font: { family: 'Noto Serif', style: 'italic', weight: 'bold' }
    * | Noto Serif Italic | italic | normal | font: { family: 'Noto Serif', style: 'italic', weight: 'normal' }
    * | Noto Serif Regular | normal | normal | font: { family: 'Noto Serif', style: 'normal', weight: 'normal' }
    * | Old Standard TT Bold | normal | bold | font: { family: 'Old Standard TT', style: 'normal', weight: 'bold' }
    * | Old Standard TT Italic | italic | normal | font: { family: 'Old Standard TT', style: 'italic', weight: 'normal' }
    * | Old Standard TT Regular | normal | normal | font: { family: 'Old Standard TT', style: 'normal', weight: 'normal' }
    * | Orbitron Bold | normal | bold | font: { family: 'Orbitron', style: 'normal', weight: 'bold' }
    * | Orbitron Regular | normal | normal | font: { family: 'Orbitron', style: 'normal', weight: 'normal' }
    * | Oregano Italic | italic | normal | font: { family: 'Oregano', style: 'italic', weight: 'normal' }
    * | Oregano Regular | normal | normal | font: { family: 'Oregano', style: 'normal', weight: 'normal' }
    * | Oswald Bold | normal | bold | font: { family: 'Oswald', style: 'normal', weight: 'bold' }
    * | Oswald Regular | normal | normal | font: { family: 'Oswald', style: 'normal', weight: 'normal' }
    * | Pacifico Regular | normal | normal | font: { family: 'Pacifico', style: 'normal', weight: 'normal' }
    * | Palatino Linotype Regular | normal | normal | font: { family: 'Palatino Linotype', style: 'normal', weight: 'normal' }
    * | Playfair Display Black Regular | normal | normal | font: { family: 'Playfair Display Black', style: 'normal', weight: 'normal' }
    * | Playfair Display Bold | normal | bold | font: { family: 'Playfair Display', style: 'normal', weight: 'bold' }
    * | Playfair Display Bold Italic | italic | bold | font: { family: 'Playfair Display', style: 'italic', weight: 'bold' }
    * | Playfair Display Italic | italic | normal | font: { family: 'Playfair Display', style: 'italic', weight: 'normal' }
    * | Playfair Display Regular | normal | normal | font: { family: 'Playfair Display', style: 'normal', weight: 'normal' }
    * | Playfair Display SC Bold | normal | bold | font: { family: 'Playfair Display SC', style: 'normal', weight: 'bold' }
    * | Playfair Display SC Regular | normal | normal | font: { family: 'Playfair Display SC', style: 'normal', weight: 'normal' }
    * | Redressed Regular | normal | normal | font: { family: 'Redressed', style: 'normal', weight: 'normal' }
    * | Risque Regular | normal | normal | font: { family: 'Risque', style: 'normal', weight: 'normal' }
    * | Roboto Condensed Italic | italic | normal | font: { family: 'Roboto Condensed', style: 'italic', weight: 'normal' }
    * | Roboto Condensed Light Italic | italic | normal | font: { family: 'Roboto Condensed Light', style: 'italic', weight: 'normal' }
    * | Rye Regular | normal | normal | font: { family: 'Rye', style: 'normal', weight: 'normal' }
    * | Special Elite Regular | normal | normal | font: { family: 'Special Elite', style: 'normal', weight: 'normal' }
    * | Syncopate Bold | normal | bold | font: { family: 'Syncopate', style: 'normal', weight: 'bold' }
    * | Syncopate Regular | normal | normal | font: { family: 'Syncopate', style: 'normal', weight: 'normal' }
    * | Tangerine Regular | normal | normal | font: { family: 'Tangerine', style: 'normal', weight: 'normal' }
    * | Ubuntu Bold | normal | bold | font: { family: 'Ubuntu', style: 'normal', weight: 'bold' }
    * | Ubuntu Bold Italic | italic | bold | font: { family: 'Ubuntu', style: 'italic', weight: 'bold' }
    * | Ubuntu Condensed Regular | normal | normal | font: { family: 'Ubuntu Condensed', style: 'normal', weight: 'normal' }
    * | Ubuntu Italic | italic | normal | font: { family: 'Ubuntu', style: 'italic', weight: 'normal' }
    * | Ubuntu Light Bold | normal | bold | font: { family: 'Ubuntu Light', style: 'normal', weight: 'bold' }
    * | Ubuntu Light Bold Italic | italic | bold | font: { family: 'Ubuntu Light', style: 'italic', weight: 'bold' }
    * | Ubuntu Light Italic | italic | normal | font: { family: 'Ubuntu Light', style: 'italic', weight: 'normal' }
    * | Ubuntu Light Regular | normal | normal | font: { family: 'Ubuntu Light', style: 'normal', weight: 'normal' }
    * | Ubuntu Medium Italic | italic | normal | font: { family: 'Ubuntu Medium', style: 'italic', weight: 'normal' }
    * | Ubuntu Mono Bold | normal | bold | font: { family: 'Ubuntu Mono', style: 'normal', weight: 'bold' }
    * | Ubuntu Mono Bold Italic | italic | bold | font: { family: 'Ubuntu Mono', style: 'italic', weight: 'bold' }
    * | Ubuntu Mono Italic | italic | normal | font: { family: 'Ubuntu Mono', style: 'italic', weight: 'normal' }
    * | Ubuntu Mono Regular | normal | normal | font: { family: 'Ubuntu Mono', style: 'normal', weight: 'normal' }
    * | Ubuntu Regular | normal | normal | font: { family: 'Ubuntu', style: 'normal', weight: 'normal' }
    * | UnifrakturCook Bold | normal | bold | font: { family: 'UnifrakturCook', style: 'normal', weight: 'bold' }
    * | Vast Shadow Regular | normal | normal | font: { family: 'Vast Shadow', style: 'normal', weight: 'normal' }
    * | Walter Turncoat Regular | normal | normal | font: { family: 'Walter Turncoat', style: 'normal', weight: 'normal' }
    * >>>
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#family)
    *
    * @default sans-serif
    */
  var family: String = js.native
  /**
    * The font size in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    * > **Known Limitations**  In 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), if the [TextSymbol3DLayer.size](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#size) property is set, it will override this [size](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#size) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#size)
    *
    * @default 9
    */
  var size: Double = js.native
  /**
    * The text style. Specifies whether a font should be styled: normal, italic, or oblique.
    * > **Known Limitations**  `oblique` is not supported in 2D [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), and [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html) labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#style)
    *
    * @default normal
    */
  var style: normal | italic | oblique = js.native
  /**
    * The text weight. Specifies the level of boldness.
    * > **Known Limitations**  `bolder` and `lighter` are not supported in 2D [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), and [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html) labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#weight)
    *
    * @default normal
    */
  var weight: normal | bold | bolder | lighter = js.native
}

