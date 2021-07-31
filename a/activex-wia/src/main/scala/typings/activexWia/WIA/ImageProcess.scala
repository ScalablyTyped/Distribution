package typings.activexWia.WIA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The ImageProcess object manages the filter chain. An ImageProcess object can be created using "WIA.ImageProcess" in a call to CreateObject. */
trait ImageProcess extends StObject {
  
  /** Takes the specified ImageFile and returns the new ImageFile with all the filters applied on success */
  def Apply(Source: ImageFile): ImageFile
  
  def FilterInfos(Index: String): FilterInfo
  /** Returns the specified item in the collection either by position or name */
  /** A collection of all available filters */
  def FilterInfos(Index: Double): FilterInfo
  /** A collection of all available filters */
  @JSName("FilterInfos")
  val FilterInfos_Original: FilterInfos
  
  /** Returns the specified item in the collection by position or FilterID */
  /** A collection of the filters to be applied in this process */
  def Filters(Index: Double): Filter
  /** A collection of the filters to be applied in this process */
  @JSName("Filters")
  val Filters_Original: Filters
  
  @JSName("WIA.ImageProcess_typekey")
  var WIADotImageProcess_typekey: ImageProcess
}
object ImageProcess {
  
  @scala.inline
  def apply(
    Apply: ImageFile => ImageFile,
    FilterInfos: FilterInfos,
    Filters: Filters,
    WIADotImageProcess_typekey: ImageProcess
  ): ImageProcess = {
    val __obj = js.Dynamic.literal(Apply = js.Any.fromFunction1(Apply), FilterInfos = FilterInfos.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.ImageProcess_typekey")(WIADotImageProcess_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProcess]
  }
  
  @scala.inline
  implicit class ImageProcessMutableBuilder[Self <: ImageProcess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: ImageFile => ImageFile): Self = StObject.set(x, "Apply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterInfos(value: FilterInfos): Self = StObject.set(x, "FilterInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIADotImageProcess_typekey(value: ImageProcess): Self = StObject.set(x, "WIA.ImageProcess_typekey", value.asInstanceOf[js.Any])
  }
}
