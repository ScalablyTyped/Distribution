package typings.`11tyEleventyImg`

import typings.`11tyEleventyImg`.`11tyEleventyImgBooleans`.`true`
import typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.auto
import typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.buffer
import typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.json
import typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.text
import typings.`11tyEleventyImg`.anon.Alt
import typings.`11tyEleventyImg`.anon.Format
import typings.`11tyEleventyImg`.anon.MetadataEntryformatavif
import typings.`11tyEleventyImg`.anon.MetadataEntryformatjpeg
import typings.`11tyEleventyImg`.anon.MetadataEntryformatpng
import typings.`11tyEleventyImg`.anon.MetadataEntryformatsvg
import typings.`11tyEleventyImg`.anon.MetadataEntryformatwebp
import typings.`11tyEleventyImg`.anon.Orientation
import typings.`11tyEleventyImg`.anon.PartialRecordImageFormatF
import typings.`11tyEleventyImg`.anon.PartialRecordImageFormats
import typings.`11tyEleventyImg`.anon.ValueOf
import typings.`11tyEleventyImg`.anon.Width
import typings.`11tyEleventyImg`.generateHtmlMod.GenerateHTMLOptions
import typings.`11tyEleventyImg`.generateHtmlMod.ImgAttributes
import typings.`11tyEleventyImg`.generateHtmlMod.PictureAttributes
import typings.node.bufferMod.global.Buffer
import typings.sharp.mod.AvifOptions
import typings.sharp.mod.JpegOptions
import typings.sharp.mod.OutputOptions
import typings.sharp.mod.PngOptions
import typings.sharp.mod.Sharp
import typings.sharp.mod.SharpOptions
import typings.sharp.mod.WebpOptions
import typings.std.Partial
import typings.std.PromiseLike
import typings.std.Record
import typings.std.RequestInit
import typings.std.Required
import typings.std.SharedArrayBuffer
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This utility returns a Promise and works best in async friendly functions, filters, shortcodes.
    * @param src Image data, either a path or a Buffer.
    * If a remote URL is given, we download the remote image and cache it locally.
    * This cached original is then used for the cache duration to avoid a bunch of network requests.
    * @example
    * const Image = require("@11ty/eleventy-img");
    *
    * (async () => {
    *   let url = "https://images.unsplash.com/photo-1608178398319-48f814d0750c";
    *   let stats = await Image(url, {
    *     widths: [300]
    *   });
    *
    *   console.log( stats );
    * })();
    */
  inline def apply(src: ImageSource): js.Promise[Metadata] = ^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Metadata]]
  inline def apply(src: ImageSource, opts: ImageOptions): js.Promise[Metadata] = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Metadata]]
  
  @JSImport("@11ty/eleventy-img", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@11ty/eleventy-img", "Image")
  @js.native
  open class Image protected () extends StObject {
    def this(src: ImageSource) = this()
    def this(src: ImageSource, opts: ImageOptions) = this()
    
    var cacheOptions: js.UndefOr[Required[js.UndefOr[CacheOptions]]] = js.native
    
    def getFileContents(): Buffer = js.native
    
    def getFullStats(metadata: Orientation): Metadata = js.native
    
    def getHash(): String = js.native
    
    def getInMemoryCacheKey(): String = js.native
    
    def getInput(): js.Promise[ImageSource] = js.native
    
    def getSharpOptionsForFormat(format: ImageFormat): OutputOptions = js.native
    
    def getStat(outputFormat: ImageFormat, width: Double, height: Double): Stats = js.native
    
    var isRemoteUrl: Boolean = js.native
    
    def needsRotation(orientation: Double): Boolean = js.native
    
    var options: Required[ImageOptions] = js.native
    
    def resize(input: String): js.Promise[Metadata] = js.native
    def resize(input: js.typedarray.Float32Array): js.Promise[Metadata] = js.native
    def resize(input: js.typedarray.Float64Array): js.Promise[Metadata] = js.native
    def resize(input: js.typedarray.Int16Array): js.Promise[Metadata] = js.native
    def resize(input: js.typedarray.Int32Array): js.Promise[Metadata] = js.native
    def resize(input: js.typedarray.Int8Array): js.Promise[Metadata] = js.native
    def resize(input: js.typedarray.Uint16Array): js.Promise[Metadata] = js.native
    def resize(input: js.typedarray.Uint32Array): js.Promise[Metadata] = js.native
    def resize(input: js.typedarray.Uint8Array): js.Promise[Metadata] = js.native
    def resize(input: js.typedarray.Uint8ClampedArray): js.Promise[Metadata] = js.native
    def resize(input: Buffer): js.Promise[Metadata] = js.native
    
    var src: ImageSource = js.native
  }
  object Image {
    
    @JSImport("@11ty/eleventy-img", "Image")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof getFormats` */
    inline def getFormatsArray(formats: String): js.Array[ImageFormat] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatsArray")(formats.asInstanceOf[js.Any]).asInstanceOf[js.Array[ImageFormat]]
    /* was `typeof getFormats` */
    inline def getFormatsArray(formats: String, autoFormat: ImageFormat): js.Array[ImageFormat] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatsArray")(formats.asInstanceOf[js.Any], autoFormat.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImageFormat]]
    inline def getFormatsArray(formats: js.Array[ImageFormatWithAliases | Null]): js.Array[ImageFormat] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatsArray")(formats.asInstanceOf[js.Any]).asInstanceOf[js.Array[ImageFormat]]
    inline def getFormatsArray(formats: js.Array[ImageFormatWithAliases | Null], autoFormat: ImageFormat): js.Array[ImageFormat] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatsArray")(formats.asInstanceOf[js.Any], autoFormat.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImageFormat]]
    
    inline def getFormatsArray_auto(formats: js.Array[ImageFormatWithAliases | Null | auto], autoFormat: ImageFormat): js.Array[ImageFormat] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatsArray")(formats.asInstanceOf[js.Any], autoFormat.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImageFormat]]
    
    /* was `typeof getWidths` */
    inline def getValidWidths(originalWidth: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValidWidths")(originalWidth.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def getValidWidths(originalWidth: Double, widths: Unit, allowUpscale: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidWidths")(originalWidth.asInstanceOf[js.Any], widths.asInstanceOf[js.Any], allowUpscale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def getValidWidths_auto(originalWidth: Double, widths: js.Array[Double | auto | Null]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidWidths")(originalWidth.asInstanceOf[js.Any], widths.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def getValidWidths_auto(originalWidth: Double, widths: js.Array[Double | auto | Null], allowUpscale: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidWidths")(originalWidth.asInstanceOf[js.Any], widths.asInstanceOf[js.Any], allowUpscale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /* static member */
    /* was `typeof statsByDimensionsSync` */
    @JSImport("@11ty/eleventy-img", "Image.statsByDimensionsSync")
    @js.native
    def statsByDimensionsSync: js.Function4[
        /* src */ ImageSource, 
        /* width */ Double, 
        /* height */ Double, 
        /* opts */ js.UndefOr[ImageOptions], 
        Metadata
      ] = js.native
    inline def statsByDimensionsSync_=(
      x: js.Function4[
          /* src */ ImageSource, 
          /* width */ Double, 
          /* height */ Double, 
          /* opts */ js.UndefOr[ImageOptions], 
          Metadata
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statsByDimensionsSync")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof statsSync` */
    @JSImport("@11ty/eleventy-img", "Image.statsSync")
    @js.native
    def statsSync: js.Function2[/* src */ ImageSource, /* opts */ js.UndefOr[ImageOptions], Metadata] = js.native
    inline def statsSync_=(x: js.Function2[/* src */ ImageSource, /* opts */ js.UndefOr[ImageOptions], Metadata]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statsSync")(x.asInstanceOf[js.Any])
  }
  
  object ImagePath {
    
    @JSImport("@11ty/eleventy-img", "ImagePath")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convertFilePathToUrl(dir: String, filename: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFilePathToUrl")(dir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def filenameFormat(id: String, src: Any, width: Double, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("filenameFormat")(id.asInstanceOf[js.Any], src.asInstanceOf[js.Any], width.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getFilename(id: String, src: Any, width: Double, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilename")(id.asInstanceOf[js.Any], src.asInstanceOf[js.Any], width.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getFilename(id: String, src: Any, width: Double, format: String, options: ImageOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilename")(id.asInstanceOf[js.Any], src.asInstanceOf[js.Any], width.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object Util {
    
    @JSImport("@11ty/eleventy-img", "Util")
    @js.native
    val ^ : js.Any = js.native
    
    /*
      * Does not mutate, returns new Object
      * Note if keysToKeep is empty it will keep all keys.
      */
    inline def getSortedObject[T /* <: js.Object */](unordered: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getSortedObject")(unordered.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def isFullUrl(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isRemoteUrl(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRemoteUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * Change global plugin concurrency
    * @default 10
    */
  @JSImport("@11ty/eleventy-img", "concurrency")
  @js.native
  def concurrency: Double = js.native
  inline def concurrency_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(x.asInstanceOf[js.Any])
  
  @JSImport("@11ty/eleventy-img", "generateHTML")
  @js.native
  val generateHTML: js.Function3[
    /* metadata */ Metadata, 
    /* attributes */ js.UndefOr[Alt & (Partial[Record[String, Any]])], 
    /* options */ js.UndefOr[GenerateHTMLOptions], 
    String
  ] = js.native
  
  inline def generateObject[AddedAttributes /* <: Alt */](metadata: Metadata): ImgAttributes[AddedAttributes] | PictureAttributes[AddedAttributes] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateObject")(metadata.asInstanceOf[js.Any]).asInstanceOf[ImgAttributes[AddedAttributes] | PictureAttributes[AddedAttributes]]
  inline def generateObject[AddedAttributes /* <: Alt */](metadata: Metadata, attributes: AddedAttributes): ImgAttributes[AddedAttributes] | PictureAttributes[AddedAttributes] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateObject")(metadata.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[ImgAttributes[AddedAttributes] | PictureAttributes[AddedAttributes]]
  
  inline def getFormats(formats: String): js.Array[ImageFormat] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormats")(formats.asInstanceOf[js.Any]).asInstanceOf[js.Array[ImageFormat]]
  inline def getFormats(formats: String, autoFormat: ImageFormat): js.Array[ImageFormat] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormats")(formats.asInstanceOf[js.Any], autoFormat.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImageFormat]]
  inline def getFormats(formats: js.Array[ImageFormatWithAliases | Null]): js.Array[ImageFormat] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormats")(formats.asInstanceOf[js.Any]).asInstanceOf[js.Array[ImageFormat]]
  inline def getFormats(formats: js.Array[ImageFormatWithAliases | Null], autoFormat: ImageFormat): js.Array[ImageFormat] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormats")(formats.asInstanceOf[js.Any], autoFormat.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImageFormat]]
  
  inline def getFormats_auto(formats: js.Array[ImageFormatWithAliases | Null | auto], autoFormat: ImageFormat): js.Array[ImageFormat] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormats")(formats.asInstanceOf[js.Any], autoFormat.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImageFormat]]
  
  inline def getHash(src: ImageSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHash")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getHash(src: ImageSource, opts: ImageOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHash")(src.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getWidths(originalWidth: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidths")(originalWidth.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def getWidths(originalWidth: Double, widths: Unit, allowUpscale: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidths")(originalWidth.asInstanceOf[js.Any], widths.asInstanceOf[js.Any], allowUpscale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getWidths_auto(originalWidth: Double, widths: js.Array[Double | auto | Null]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidths")(originalWidth.asInstanceOf[js.Any], widths.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getWidths_auto(originalWidth: Double, widths: js.Array[Double | auto | Null], allowUpscale: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidths")(originalWidth.asInstanceOf[js.Any], widths.asInstanceOf[js.Any], allowUpscale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def statsByDimensionsSync(src: ImageSource, width: Double, height: Double): Metadata = (^.asInstanceOf[js.Dynamic].applyDynamic("statsByDimensionsSync")(src.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Metadata]
  inline def statsByDimensionsSync(src: ImageSource, width: Double, height: Double, opts: ImageOptions): Metadata = (^.asInstanceOf[js.Dynamic].applyDynamic("statsByDimensionsSync")(src.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Metadata]
  
  /**
    * Use `Image.statsSync` to get the metadata of a source even if the image generation is not finished yet.
    *
    * `statsSync` doesn’t generate any files, but will tell you where the asynchronously generated files will end up!
    * This is useful in synchronous-only template environments where you need the image URLs synchronously
    * but can’t rely on the files being in the correct location yet.
    *
    * `options.dryRun` is still asynchronous but also doesn’t generate any files.
    */
  inline def statsSync(src: ImageSource): Metadata = ^.asInstanceOf[js.Dynamic].applyDynamic("statsSync")(src.asInstanceOf[js.Any]).asInstanceOf[Metadata]
  inline def statsSync(src: ImageSource, opts: ImageOptions): Metadata = (^.asInstanceOf[js.Dynamic].applyDynamic("statsSync")(src.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Metadata]
  
  type Awaitable[T] = PromiseLike[T] | T
  
  trait BaseImageOptions
    extends StObject
       with ImageOptions {
    
    /**
      * @deprecated use cacheOptions.duration
      */
    var cacheDuration: js.UndefOr[String] = js.undefined
    
    /**
      * For any full URL first argument to this plugin,
      * the full-size remote image will be downloaded and cached locally.
      */
    var cacheOptions: js.UndefOr[CacheOptions] = js.undefined
    
    /**
      * @default 10
      */
    var concurrency: js.UndefOr[Double] = js.undefined
    
    /**
      * Also returns a buffer instance in the return object. Doesn’t write anything to the file system
      */
    var dryRun: js.UndefOr[Boolean] = js.undefined
    
    var extensions: js.UndefOr[PartialRecordImageFormats] = js.undefined
    
    /**
      * Custom filenames
      *
      * Don’t like those hash ids? Make your own!
      * @param id hash of the original image
      * @param src original image path
      * @param width current width in px
      * @param format current file format
      * @param options set of options passed to the Image call
      *
      * @example
      * const path = require("path");
      * const Image = require("@11ty/eleventy-img");
      *
      * await Image("./test/bio-2017.jpg", {
      *   widths: [300],
      *   formats: [null],
      *   filenameFormat: function (id, src, width, format, options) {
      *     const extension = path.extname(src);
      *     const name = path.basename(src, extension);
      *
      *     return `${name}-${width}w.${format}`;
      *   }
      * });
      *
      * // Writes: "test/img/bio-2017-300w.jpeg"
      */
    var filenameFormat: js.UndefOr[
        (js.Function5[
          /* id */ String, 
          /* src */ String, 
          /* width */ Double, 
          /* format */ String, 
          /* options */ Required[ImageOptions], 
          js.UndefOr[String | Null]
        ]) | Null
      ] = js.undefined
    
    var formatHooks: js.UndefOr[PartialRecordImageFormatF] = js.undefined
    
    /**
      * Controls the output image formats.
      * - `null and `'auto'` keep the original format.
      * - `svg` requires SVG input to work.
      * @default ['webp', 'jpeg']
      */
    var formats: js.UndefOr[js.Array[ImageFormatWithAliases | auto | Null]] = js.undefined
    
    /**
      * Customize the length of the default filename format hash
      * @default 10
      */
    var hashLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Where to write the new images to disk.
      * Project-relative path to the output image directory.
      * Maybe you want to write these to your output directory directly (e.g. `./_site/img/`)?
      * @default "img/"
      */
    var outputDir: js.UndefOr[String] = js.undefined
    
    /** options passed to the Sharp avif output method */
    var sharpAvifOptions: js.UndefOr[AvifOptions] = js.undefined
    
    /** options passed to the Sharp jpeg output method */
    var sharpJpegOptions: js.UndefOr[JpegOptions] = js.undefined
    
    /** options passed to the Sharp constructor */
    var sharpOptions: js.UndefOr[SharpOptions] = js.undefined
    
    /** options passed to the Sharp png output method */
    var sharpPngOptions: js.UndefOr[PngOptions] = js.undefined
    
    /** options passed to the Sharp webp output method */
    var sharpWebpOptions: js.UndefOr[WebpOptions] = js.undefined
    
    /**
      * If true, skips all image processing, just return stats. Doesn’t read files, doesn’t write files.
      * Important to note that `dryRun: true` performs image processing and includes a buffer—this does not.
      * Useful when used with `urlFormat` above.
      * Better than .statsSync* functions, because this will use the in-memory cache and de-dupe requests. Those will not.
      */
    var statsOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow SVG to upscale
      *
      * While we do prevent raster images from upscaling (and filter upscaling widths from the output),
      * you can optionally enable SVG input to upscale to larger sizes when converting to raster format.
      * @default true
      */
    var svgAllowUpscale: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Skip raster formats for SVG
      *
      * If using SVG output (the input format is SVG and svg is added to your formats array),
      * we will skip all of the raster formats even if they’re in formats.
      * This may be useful in a CMS-driven workflow when the input could be vector or raster.
      * @default false
      */
    var svgShortCircuit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * urlFormat allows you to return a full URL to an image including the domain.
      * Useful when you’re using your own hosted image service (probably via .statsSync or .statsByDimensionsSync)
      * Note: when you use this, metadata will not include .filename or .outputPath
      * @example
      * {
      *   urlFormat: function ({
      *     hash, // not included for `statsOnly` images
      *     src,
      *     width,
      *     format,
      *   }) {
      *     return `https://sample-image-service.11ty.dev/${encodeURIComponent(src)}/${width}/${format}/`;
      *   }
      * }
      */
    var urlFormat: js.UndefOr[
        (js.Function2[/* format */ Format, /* options */ Required[ImageOptions], String]) | Null
      ] = js.undefined
    
    /**
      * A path-prefix-esque directory for the `<img src>` attribute.
      * e.g. `/img/` for `<img src="/img/MY_IMAGE.jpeg">`.
      * @default "/img/"
      */
    var urlPath: js.UndefOr[String] = js.undefined
    
    /**
      * in-memory cache
      * @default true
      */
    var useCache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Advanced
      * @default true
      */
    var useCacheValidityInHash: js.UndefOr[`true`] = js.undefined
    
    /**
      * Controls how many output images will be created for each image format. Aspect ratio is preserved.
      * - numbers represent output width in pixels.
      * - `null` and `'auto'` represent the original image width.
      * @default [null]
      */
    var widths: js.UndefOr[js.Array[Double | auto | Null]] = js.undefined
  }
  object BaseImageOptions {
    
    inline def apply(): BaseImageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseImageOptions]
    }
    
    extension [Self <: BaseImageOptions](x: Self) {
      
      inline def setCacheDuration(value: String): Self = StObject.set(x, "cacheDuration", value.asInstanceOf[js.Any])
      
      inline def setCacheDurationUndefined: Self = StObject.set(x, "cacheDuration", js.undefined)
      
      inline def setCacheOptions(value: CacheOptions): Self = StObject.set(x, "cacheOptions", value.asInstanceOf[js.Any])
      
      inline def setCacheOptionsUndefined: Self = StObject.set(x, "cacheOptions", js.undefined)
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      inline def setExtensions(value: PartialRecordImageFormats): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setFilenameFormat(
        value: (/* id */ String, /* src */ String, /* width */ Double, /* format */ String, /* options */ Required[ImageOptions]) => js.UndefOr[String | Null]
      ): Self = StObject.set(x, "filenameFormat", js.Any.fromFunction5(value))
      
      inline def setFilenameFormatNull: Self = StObject.set(x, "filenameFormat", null)
      
      inline def setFilenameFormatUndefined: Self = StObject.set(x, "filenameFormat", js.undefined)
      
      inline def setFormatHooks(value: PartialRecordImageFormatF): Self = StObject.set(x, "formatHooks", value.asInstanceOf[js.Any])
      
      inline def setFormatHooksUndefined: Self = StObject.set(x, "formatHooks", js.undefined)
      
      inline def setFormats(value: js.Array[ImageFormatWithAliases | auto | Null]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setFormatsVarargs(value: (ImageFormatWithAliases | auto | Null)*): Self = StObject.set(x, "formats", js.Array(value*))
      
      inline def setHashLength(value: Double): Self = StObject.set(x, "hashLength", value.asInstanceOf[js.Any])
      
      inline def setHashLengthUndefined: Self = StObject.set(x, "hashLength", js.undefined)
      
      inline def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
      
      inline def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
      
      inline def setSharpAvifOptions(value: AvifOptions): Self = StObject.set(x, "sharpAvifOptions", value.asInstanceOf[js.Any])
      
      inline def setSharpAvifOptionsUndefined: Self = StObject.set(x, "sharpAvifOptions", js.undefined)
      
      inline def setSharpJpegOptions(value: JpegOptions): Self = StObject.set(x, "sharpJpegOptions", value.asInstanceOf[js.Any])
      
      inline def setSharpJpegOptionsUndefined: Self = StObject.set(x, "sharpJpegOptions", js.undefined)
      
      inline def setSharpOptions(value: SharpOptions): Self = StObject.set(x, "sharpOptions", value.asInstanceOf[js.Any])
      
      inline def setSharpOptionsUndefined: Self = StObject.set(x, "sharpOptions", js.undefined)
      
      inline def setSharpPngOptions(value: PngOptions): Self = StObject.set(x, "sharpPngOptions", value.asInstanceOf[js.Any])
      
      inline def setSharpPngOptionsUndefined: Self = StObject.set(x, "sharpPngOptions", js.undefined)
      
      inline def setSharpWebpOptions(value: WebpOptions): Self = StObject.set(x, "sharpWebpOptions", value.asInstanceOf[js.Any])
      
      inline def setSharpWebpOptionsUndefined: Self = StObject.set(x, "sharpWebpOptions", js.undefined)
      
      inline def setStatsOnly(value: Boolean): Self = StObject.set(x, "statsOnly", value.asInstanceOf[js.Any])
      
      inline def setStatsOnlyUndefined: Self = StObject.set(x, "statsOnly", js.undefined)
      
      inline def setSvgAllowUpscale(value: Boolean): Self = StObject.set(x, "svgAllowUpscale", value.asInstanceOf[js.Any])
      
      inline def setSvgAllowUpscaleUndefined: Self = StObject.set(x, "svgAllowUpscale", js.undefined)
      
      inline def setSvgShortCircuit(value: Boolean): Self = StObject.set(x, "svgShortCircuit", value.asInstanceOf[js.Any])
      
      inline def setSvgShortCircuitUndefined: Self = StObject.set(x, "svgShortCircuit", js.undefined)
      
      inline def setUrlFormat(value: (/* format */ Format, /* options */ Required[ImageOptions]) => String): Self = StObject.set(x, "urlFormat", js.Any.fromFunction2(value))
      
      inline def setUrlFormatNull: Self = StObject.set(x, "urlFormat", null)
      
      inline def setUrlFormatUndefined: Self = StObject.set(x, "urlFormat", js.undefined)
      
      inline def setUrlPath(value: String): Self = StObject.set(x, "urlPath", value.asInstanceOf[js.Any])
      
      inline def setUrlPathUndefined: Self = StObject.set(x, "urlPath", js.undefined)
      
      inline def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
      
      inline def setUseCacheUndefined: Self = StObject.set(x, "useCache", js.undefined)
      
      inline def setUseCacheValidityInHash(value: `true`): Self = StObject.set(x, "useCacheValidityInHash", value.asInstanceOf[js.Any])
      
      inline def setUseCacheValidityInHashUndefined: Self = StObject.set(x, "useCacheValidityInHash", js.undefined)
      
      inline def setWidths(value: js.Array[Double | auto | Null]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
      
      inline def setWidthsVarargs(value: (Double | auto | Null)*): Self = StObject.set(x, "widths", js.Array(value*))
    }
  }
  
  trait CacheOptions extends StObject {
    
    /**
      * @default 10
      */
    var concurrency: js.UndefOr[Double] = js.undefined
    
    /**
      * @default ".cache"
      */
    var directory: js.UndefOr[String] = js.undefined
    
    var dryRun: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default '1d'
      */
    var duration: js.UndefOr[String] = js.undefined
    
    var fetchOptions: js.UndefOr[RequestInit] = js.undefined
    
    /**
      * Truncates the hash to this length
      * @default 30
      */
    var hashLength: js.UndefOr[Double] = js.undefined
    
    var removeUrlQueryParams: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 'buffer'
      */
    var `type`: js.UndefOr[buffer | json | text] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object CacheOptions {
    
    inline def apply(): CacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheOptions]
    }
    
    extension [Self <: CacheOptions](x: Self) {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setFetchOptions(value: RequestInit): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      inline def setHashLength(value: Double): Self = StObject.set(x, "hashLength", value.asInstanceOf[js.Any])
      
      inline def setHashLengthUndefined: Self = StObject.set(x, "hashLength", js.undefined)
      
      inline def setRemoveUrlQueryParams(value: Boolean): Self = StObject.set(x, "removeUrlQueryParams", value.asInstanceOf[js.Any])
      
      inline def setRemoveUrlQueryParamsUndefined: Self = StObject.set(x, "removeUrlQueryParams", js.undefined)
      
      inline def setType(value: buffer | json | text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type FormatHook = js.ThisFunction1[
    /* this */ MetadataEntry, 
    /* sharpInstance */ Sharp, 
    Awaitable[WithImplicitCoercion[js.typedarray.ArrayBuffer | SharedArrayBuffer]]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.webp
    - typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.jpeg
    - typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.png
    - typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.svg
    - typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.avif
  */
  trait ImageFormat extends StObject
  object ImageFormat {
    
    inline def avif: typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.avif = "avif".asInstanceOf[typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.avif]
    
    inline def jpeg: typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.jpeg = "jpeg".asInstanceOf[typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.jpeg]
    
    inline def png: typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.png = "png".asInstanceOf[typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.png]
    
    inline def svg: typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.svg = "svg".asInstanceOf[typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.svg]
    
    inline def webp: typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.webp = "webp".asInstanceOf[typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.webp]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.jpg
    - typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.svgPlussignxml
    - typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.webp
    - typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.jpeg
    - typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.png
    - typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.svg
    - typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.avif
  */
  trait ImageFormatWithAliases extends StObject
  object ImageFormatWithAliases {
    
    inline def avif: typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.avif = "avif".asInstanceOf[typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.avif]
    
    inline def jpeg: typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.jpeg = "jpeg".asInstanceOf[typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.jpeg]
    
    inline def jpg: typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.jpg = "jpg".asInstanceOf[typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.jpg]
    
    inline def png: typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.png = "png".asInstanceOf[typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.png]
    
    inline def svg: typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.svg = "svg".asInstanceOf[typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.svg]
    
    inline def svgPlussignxml: typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.svgPlussignxml = "svg+xml".asInstanceOf[typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.svgPlussignxml]
    
    inline def webp: typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.webp = "webp".asInstanceOf[typings.`11tyEleventyImg`.`11tyEleventyImgStrings`.webp]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.`11tyEleventyImg`.mod.StatsOnlyImageOptions
    - typings.`11tyEleventyImg`.mod.BaseImageOptions
  */
  trait ImageOptions extends StObject
  object ImageOptions {
    
    inline def BaseImageOptions(): typings.`11tyEleventyImg`.mod.BaseImageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.`11tyEleventyImg`.mod.BaseImageOptions]
    }
    
    inline def StatsOnlyImageOptions(): typings.`11tyEleventyImg`.mod.StatsOnlyImageOptions = {
      val __obj = js.Dynamic.literal(statsOnly = true)
      __obj.asInstanceOf[typings.`11tyEleventyImg`.mod.StatsOnlyImageOptions]
    }
  }
  
  type ImageSource = String | URL | Buffer
  
  /* Inlined {[ Format in @11ty/eleventy-img.@11ty/eleventy-img.ImageFormat ]:? std.Array<@11ty/eleventy-img.@11ty/eleventy-img.MetadataEntry & {  format :Format}>} */
  trait Metadata extends StObject {
    
    var avif: js.UndefOr[js.Array[MetadataEntryformatavif]] = js.undefined
    
    var jpeg: js.UndefOr[js.Array[MetadataEntryformatjpeg]] = js.undefined
    
    var png: js.UndefOr[js.Array[MetadataEntryformatpng]] = js.undefined
    
    var svg: js.UndefOr[js.Array[MetadataEntryformatsvg]] = js.undefined
    
    var webp: js.UndefOr[js.Array[MetadataEntryformatwebp]] = js.undefined
  }
  object Metadata {
    
    inline def apply(): Metadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Metadata]
    }
    
    extension [Self <: Metadata](x: Self) {
      
      inline def setAvif(value: js.Array[MetadataEntryformatavif]): Self = StObject.set(x, "avif", value.asInstanceOf[js.Any])
      
      inline def setAvifUndefined: Self = StObject.set(x, "avif", js.undefined)
      
      inline def setAvifVarargs(value: MetadataEntryformatavif*): Self = StObject.set(x, "avif", js.Array(value*))
      
      inline def setJpeg(value: js.Array[MetadataEntryformatjpeg]): Self = StObject.set(x, "jpeg", value.asInstanceOf[js.Any])
      
      inline def setJpegUndefined: Self = StObject.set(x, "jpeg", js.undefined)
      
      inline def setJpegVarargs(value: MetadataEntryformatjpeg*): Self = StObject.set(x, "jpeg", js.Array(value*))
      
      inline def setPng(value: js.Array[MetadataEntryformatpng]): Self = StObject.set(x, "png", value.asInstanceOf[js.Any])
      
      inline def setPngUndefined: Self = StObject.set(x, "png", js.undefined)
      
      inline def setPngVarargs(value: MetadataEntryformatpng*): Self = StObject.set(x, "png", js.Array(value*))
      
      inline def setSvg(value: js.Array[MetadataEntryformatsvg]): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
      
      inline def setSvgVarargs(value: MetadataEntryformatsvg*): Self = StObject.set(x, "svg", js.Array(value*))
      
      inline def setWebp(value: js.Array[MetadataEntryformatwebp]): Self = StObject.set(x, "webp", value.asInstanceOf[js.Any])
      
      inline def setWebpUndefined: Self = StObject.set(x, "webp", js.undefined)
      
      inline def setWebpVarargs(value: MetadataEntryformatwebp*): Self = StObject.set(x, "webp", js.Array(value*))
    }
  }
  
  trait MetadataEntry extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var format: ImageFormat
    
    var height: Double
    
    var outputPath: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var sourceType: String
    
    var srcset: String
    
    var url: String
    
    var width: Double
  }
  object MetadataEntry {
    
    inline def apply(
      format: ImageFormat,
      height: Double,
      sourceType: String,
      srcset: String,
      url: String,
      width: Double
    ): MetadataEntry = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], srcset = srcset.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataEntry]
    }
    
    extension [Self <: MetadataEntry](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFormat(value: ImageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
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
  
  trait Stats extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var format: ImageFormat
    
    var height: Double
    
    var outputPath: js.UndefOr[String] = js.undefined
    
    var sourceType: String
    
    var srcset: String
    
    var url: String
    
    var width: Double
  }
  object Stats {
    
    inline def apply(
      format: ImageFormat,
      height: Double,
      sourceType: String,
      srcset: String,
      url: String,
      width: Double
    ): Stats = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], srcset = srcset.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFormat(value: ImageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
      
      inline def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.`11tyEleventyImg`.mod.ImageOptions because Already inherited */ trait StatsOnlyImageOptions
    extends StObject
       with BaseImageOptions {
    
    /** For `statsOnly` remote images, this needs to be populated with { width, height, format? } */
    var remoteImageMetadata: js.UndefOr[Width] = js.undefined
    
    @JSName("statsOnly")
    var statsOnly_StatsOnlyImageOptions: `true`
  }
  object StatsOnlyImageOptions {
    
    inline def apply(): StatsOnlyImageOptions = {
      val __obj = js.Dynamic.literal(statsOnly = true)
      __obj.asInstanceOf[StatsOnlyImageOptions]
    }
    
    extension [Self <: StatsOnlyImageOptions](x: Self) {
      
      inline def setRemoteImageMetadata(value: Width): Self = StObject.set(x, "remoteImageMetadata", value.asInstanceOf[js.Any])
      
      inline def setRemoteImageMetadataUndefined: Self = StObject.set(x, "remoteImageMetadata", js.undefined)
      
      inline def setStatsOnly(value: `true`): Self = StObject.set(x, "statsOnly", value.asInstanceOf[js.Any])
    }
  }
  
  type WithImplicitCoercion[T] = T | ValueOf[T]
}
