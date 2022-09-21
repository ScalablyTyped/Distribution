package typings.`11tyEleventyImg`

import typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.avif
import typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.jpeg
import typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.png
import typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.svg
import typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.webp
import typings.`11tyEleventyImg`.mod.FormatHook
import typings.`11tyEleventyImg`.mod.ImageFormat
import typings.`11tyEleventyImg`.mod.ImageFormatWithAliases
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alt extends StObject {
    
    var alt: String
  }
  object Alt {
    
    inline def apply(alt: String): Alt = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alt]
    }
    
    extension [Self <: Alt](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    }
  }
  
  trait Format extends StObject {
    
    var format: String
    
    var hash: String
    
    var src: String
    
    var width: Double
  }
  object Format {
    
    inline def apply(format: String, hash: String, src: String, width: Double): Format = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var sizes: js.UndefOr[String] = js.undefined
    
    var src: String
    
    var srcset: js.UndefOr[String] = js.undefined
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, src: String, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
      
      inline def setSrcsetUndefined: Self = StObject.set(x, "srcset", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @11ty/eleventy-img.@11ty/eleventy-img.MetadataEntry & {  format :'avif'} */
  trait MetadataEntryformatavif extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var format: ImageFormat & avif
    
    var height: Double
    
    var outputPath: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var sourceType: String
    
    var srcset: String
    
    var url: String
    
    var width: Double
  }
  object MetadataEntryformatavif {
    
    inline def apply(
      format: ImageFormat & avif,
      height: Double,
      sourceType: String,
      srcset: String,
      url: String,
      width: Double
    ): MetadataEntryformatavif = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], srcset = srcset.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataEntryformatavif]
    }
    
    extension [Self <: MetadataEntryformatavif](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFormat(value: ImageFormat & avif): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @11ty/eleventy-img.@11ty/eleventy-img.MetadataEntry & {  format :'jpeg'} */
  trait MetadataEntryformatjpeg extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var format: ImageFormat & jpeg
    
    var height: Double
    
    var outputPath: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var sourceType: String
    
    var srcset: String
    
    var url: String
    
    var width: Double
  }
  object MetadataEntryformatjpeg {
    
    inline def apply(
      format: ImageFormat & jpeg,
      height: Double,
      sourceType: String,
      srcset: String,
      url: String,
      width: Double
    ): MetadataEntryformatjpeg = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], srcset = srcset.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataEntryformatjpeg]
    }
    
    extension [Self <: MetadataEntryformatjpeg](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFormat(value: ImageFormat & jpeg): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @11ty/eleventy-img.@11ty/eleventy-img.MetadataEntry & {  format :'png'} */
  trait MetadataEntryformatpng extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var format: ImageFormat & png
    
    var height: Double
    
    var outputPath: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var sourceType: String
    
    var srcset: String
    
    var url: String
    
    var width: Double
  }
  object MetadataEntryformatpng {
    
    inline def apply(
      format: ImageFormat & png,
      height: Double,
      sourceType: String,
      srcset: String,
      url: String,
      width: Double
    ): MetadataEntryformatpng = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], srcset = srcset.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataEntryformatpng]
    }
    
    extension [Self <: MetadataEntryformatpng](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFormat(value: ImageFormat & png): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @11ty/eleventy-img.@11ty/eleventy-img.MetadataEntry & {  format :'svg'} */
  trait MetadataEntryformatsvg extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var format: ImageFormat & svg
    
    var height: Double
    
    var outputPath: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var sourceType: String
    
    var srcset: String
    
    var url: String
    
    var width: Double
  }
  object MetadataEntryformatsvg {
    
    inline def apply(
      format: ImageFormat & svg,
      height: Double,
      sourceType: String,
      srcset: String,
      url: String,
      width: Double
    ): MetadataEntryformatsvg = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], srcset = srcset.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataEntryformatsvg]
    }
    
    extension [Self <: MetadataEntryformatsvg](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFormat(value: ImageFormat & svg): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @11ty/eleventy-img.@11ty/eleventy-img.MetadataEntry & {  format :'webp'} */
  trait MetadataEntryformatwebp extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var format: ImageFormat & webp
    
    var height: Double
    
    var outputPath: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var sourceType: String
    
    var srcset: String
    
    var url: String
    
    var width: Double
  }
  object MetadataEntryformatwebp {
    
    inline def apply(
      format: ImageFormat & webp,
      height: Double,
      sourceType: String,
      srcset: String,
      url: String,
      width: Double
    ): MetadataEntryformatwebp = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], srcset = srcset.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataEntryformatwebp]
    }
    
    extension [Self <: MetadataEntryformatwebp](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFormat(value: ImageFormat & webp): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Orientation extends StObject {
    
    var format: js.UndefOr[ImageFormatWithAliases] = js.undefined
    
    var height: Double
    
    var orientation: js.UndefOr[Double] = js.undefined
    
    var width: Double
  }
  object Orientation {
    
    inline def apply(height: Double, width: Double): Orientation = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Orientation]
    }
    
    extension [Self <: Orientation](x: Self) {
      
      inline def setFormat(value: ImageFormatWithAliases): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Record<@11ty/eleventy-img.@11ty/eleventy-img.ImageFormat, @11ty/eleventy-img.@11ty/eleventy-img.FormatHook>> */
  trait PartialRecordImageFormatF extends StObject {
    
    var avif: js.UndefOr[FormatHook] = js.undefined
    
    var jpeg: js.UndefOr[FormatHook] = js.undefined
    
    var png: js.UndefOr[FormatHook] = js.undefined
    
    var svg: js.UndefOr[FormatHook] = js.undefined
    
    var webp: js.UndefOr[FormatHook] = js.undefined
  }
  object PartialRecordImageFormatF {
    
    inline def apply(): PartialRecordImageFormatF = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordImageFormatF]
    }
    
    extension [Self <: PartialRecordImageFormatF](x: Self) {
      
      inline def setAvif(value: FormatHook): Self = StObject.set(x, "avif", value.asInstanceOf[js.Any])
      
      inline def setAvifUndefined: Self = StObject.set(x, "avif", js.undefined)
      
      inline def setJpeg(value: FormatHook): Self = StObject.set(x, "jpeg", value.asInstanceOf[js.Any])
      
      inline def setJpegUndefined: Self = StObject.set(x, "jpeg", js.undefined)
      
      inline def setPng(value: FormatHook): Self = StObject.set(x, "png", value.asInstanceOf[js.Any])
      
      inline def setPngUndefined: Self = StObject.set(x, "png", js.undefined)
      
      inline def setSvg(value: FormatHook): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
      
      inline def setWebp(value: FormatHook): Self = StObject.set(x, "webp", value.asInstanceOf[js.Any])
      
      inline def setWebpUndefined: Self = StObject.set(x, "webp", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<@11ty/eleventy-img.@11ty/eleventy-img.ImageFormat, string>> */
  trait PartialRecordImageFormats extends StObject {
    
    var avif: js.UndefOr[String] = js.undefined
    
    var jpeg: js.UndefOr[String] = js.undefined
    
    var png: js.UndefOr[String] = js.undefined
    
    var svg: js.UndefOr[String] = js.undefined
    
    var webp: js.UndefOr[String] = js.undefined
  }
  object PartialRecordImageFormats {
    
    inline def apply(): PartialRecordImageFormats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordImageFormats]
    }
    
    extension [Self <: PartialRecordImageFormats](x: Self) {
      
      inline def setAvif(value: String): Self = StObject.set(x, "avif", value.asInstanceOf[js.Any])
      
      inline def setAvifUndefined: Self = StObject.set(x, "avif", js.undefined)
      
      inline def setJpeg(value: String): Self = StObject.set(x, "jpeg", value.asInstanceOf[js.Any])
      
      inline def setJpegUndefined: Self = StObject.set(x, "jpeg", js.undefined)
      
      inline def setPng(value: String): Self = StObject.set(x, "png", value.asInstanceOf[js.Any])
      
      inline def setPngUndefined: Self = StObject.set(x, "png", js.undefined)
      
      inline def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
      
      inline def setWebp(value: String): Self = StObject.set(x, "webp", value.asInstanceOf[js.Any])
      
      inline def setWebpUndefined: Self = StObject.set(x, "webp", js.undefined)
    }
  }
  
  trait Sizes extends StObject {
    
    var sizes: js.UndefOr[String] = js.undefined
    
    var srcset: String
    
    var `type`: String
  }
  object Sizes {
    
    inline def apply(srcset: String, `type`: String): Sizes = {
      val __obj = js.Dynamic.literal(srcset = srcset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sizes]
    }
    
    extension [Self <: Sizes](x: Self) {
      
      inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueOf[T] extends StObject
  
  trait Width extends StObject {
    
    var format: js.UndefOr[ImageFormat] = js.undefined
    
    var height: Double
    
    var width: Double
  }
  object Width {
    
    inline def apply(height: Double, width: Double): Width = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Width]
    }
    
    extension [Self <: Width](x: Self) {
      
      inline def setFormat(value: ImageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
