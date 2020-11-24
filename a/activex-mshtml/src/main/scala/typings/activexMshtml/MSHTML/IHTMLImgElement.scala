package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLImgElement extends js.Object {
  
  @JSName("MSHTML.IHTMLImgElement_typekey")
  var MSHTMLDotIHTMLImgElement_typekey: IHTMLImgElement = js.native
  
  var align: String = js.native
  
  var alt: String = js.native
  
  var border: js.Any = js.native
  
  val complete: Boolean = js.native
  
  var dynsrc: String = js.native
  
  val fileCreatedDate: String = js.native
  
  val fileModifiedDate: String = js.native
  
  val fileSize: String = js.native
  
  val fileUpdatedDate: String = js.native
  
  var height: Double = js.native
  
  val href: String = js.native
  
  var hspace: Double = js.native
  
  var isMap: Boolean = js.native
  
  var loop: js.Any = js.native
  
  var lowsrc: String = js.native
  
  val mimeType: String = js.native
  
  var name: String = js.native
  
  val nameProp: String = js.native
  
  var onabort: js.Any = js.native
  
  var onerror: js.Any = js.native
  
  var onload: js.Any = js.native
  
  val protocol: String = js.native
  
  val readyState: String = js.native
  
  var src: String = js.native
  
  var start: String = js.native
  
  var useMap: String = js.native
  
  var vrml: String = js.native
  
  var vspace: Double = js.native
  
  var width: Double = js.native
}
object IHTMLImgElement {
  
  @scala.inline
  def apply(
    MSHTMLDotIHTMLImgElement_typekey: IHTMLImgElement,
    align: String,
    alt: String,
    border: js.Any,
    complete: Boolean,
    dynsrc: String,
    fileCreatedDate: String,
    fileModifiedDate: String,
    fileSize: String,
    fileUpdatedDate: String,
    height: Double,
    href: String,
    hspace: Double,
    isMap: Boolean,
    loop: js.Any,
    lowsrc: String,
    mimeType: String,
    name: String,
    nameProp: String,
    onabort: js.Any,
    onerror: js.Any,
    onload: js.Any,
    protocol: String,
    readyState: String,
    src: String,
    start: String,
    useMap: String,
    vrml: String,
    vspace: Double,
    width: Double
  ): IHTMLImgElement = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], alt = alt.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], dynsrc = dynsrc.asInstanceOf[js.Any], fileCreatedDate = fileCreatedDate.asInstanceOf[js.Any], fileModifiedDate = fileModifiedDate.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], fileUpdatedDate = fileUpdatedDate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], hspace = hspace.asInstanceOf[js.Any], isMap = isMap.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], lowsrc = lowsrc.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameProp = nameProp.asInstanceOf[js.Any], onabort = onabort.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onload = onload.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], useMap = useMap.asInstanceOf[js.Any], vrml = vrml.asInstanceOf[js.Any], vspace = vspace.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLImgElement_typekey")(MSHTMLDotIHTMLImgElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLImgElement]
  }
  
  @scala.inline
  implicit class IHTMLImgElementOps[Self <: IHTMLImgElement] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotIHTMLImgElement_typekey(value: IHTMLImgElement): Self = this.set("MSHTML.IHTMLImgElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: js.Any): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynsrc(value: String): Self = this.set("dynsrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileCreatedDate(value: String): Self = this.set("fileCreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileModifiedDate(value: String): Self = this.set("fileModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSize(value: String): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUpdatedDate(value: String): Self = this.set("fileUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHspace(value: Double): Self = this.set("hspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMap(value: Boolean): Self = this.set("isMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoop(value: js.Any): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowsrc(value: String): Self = this.set("lowsrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameProp(value: String): Self = this.set("nameProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnabort(value: js.Any): Self = this.set("onabort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnerror(value: js.Any): Self = this.set("onerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnload(value: js.Any): Self = this.set("onload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyState(value: String): Self = this.set("readyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMap(value: String): Self = this.set("useMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVrml(value: String): Self = this.set("vrml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVspace(value: Double): Self = this.set("vspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
