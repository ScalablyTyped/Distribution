package typings.amapJsApi

import typings.amapJsApi.AMap.AnimationName
import typings.amapJsApi.AMap.LabelMarker.Anchor
import typings.amapJsApi.AMap.LabelMarker.FontWeight
import typings.amapJsApi.AMap.LabelMarker.TextDirection
import typings.amapJsApi.AMap.Lang
import typings.amapJsApi.AMap.Map.ViewMode
import typings.amapJsApi.AMap.Marker.LabelDirection
import typings.amapJsApi.AMap.StrokeLineCap
import typings.amapJsApi.AMap.StrokeLineJoin
import typings.amapJsApi.AMap.StrokeStyle
import typings.amapJsApi.AMap.Text.TextAlign
import typings.amapJsApi.AMap.Text.VerticalAlign
import typings.amapJsApi.AMap.convertFrom.SearchStatus
import typings.amapJsApi.AMap.convertFrom.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amapJsApiStrings {
  
  @js.native
  sealed trait `2D`
    extends StObject
       with ViewMode
  inline def `2D`: `2D` = "2D".asInstanceOf[`2D`]
  
  @js.native
  sealed trait `3D`
    extends StObject
       with ViewMode
  inline def `3D`: `3D` = "3D".asInstanceOf[`3D`]
  
  @js.native
  sealed trait AMAP_ANIMATION_BOUNCE
    extends StObject
       with AnimationName
  inline def AMAP_ANIMATION_BOUNCE: AMAP_ANIMATION_BOUNCE = "AMAP_ANIMATION_BOUNCE".asInstanceOf[AMAP_ANIMATION_BOUNCE]
  
  @js.native
  sealed trait AMAP_ANIMATION_DROP
    extends StObject
       with AnimationName
  inline def AMAP_ANIMATION_DROP: AMAP_ANIMATION_DROP = "AMAP_ANIMATION_DROP".asInstanceOf[AMAP_ANIMATION_DROP]
  
  @js.native
  sealed trait AMAP_ANIMATION_NONE
    extends StObject
       with AnimationName
  inline def AMAP_ANIMATION_NONE: AMAP_ANIMATION_NONE = "AMAP_ANIMATION_NONE".asInstanceOf[AMAP_ANIMATION_NONE]
  
  @js.native
  sealed trait EPGS3395 extends StObject
  inline def EPGS3395: EPGS3395 = "EPGS3395".asInstanceOf[EPGS3395]
  
  @js.native
  sealed trait EPGS3857 extends StObject
  inline def EPGS3857: EPGS3857 = "EPGS3857".asInstanceOf[EPGS3857]
  
  @js.native
  sealed trait EPGS4326 extends StObject
  inline def EPGS4326: EPGS4326 = "EPGS4326".asInstanceOf[EPGS4326]
  
  @js.native
  sealed trait EPSG3395 extends StObject
  inline def EPSG3395: EPSG3395 = "EPSG3395".asInstanceOf[EPSG3395]
  
  @js.native
  sealed trait EPSG3857 extends StObject
  inline def EPSG3857: EPSG3857 = "EPSG3857".asInstanceOf[EPSG3857]
  
  @js.native
  sealed trait EPSG4326 extends StObject
  inline def EPSG4326: EPSG4326 = "EPSG4326".asInstanceOf[EPSG4326]
  
  @js.native
  sealed trait FALSE extends StObject
  inline def FALSE: FALSE = "FALSE".asInstanceOf[FALSE]
  
  @js.native
  sealed trait Feature extends StObject
  inline def Feature: Feature = "Feature".asInstanceOf[Feature]
  
  @js.native
  sealed trait FeatureCollection extends StObject
  inline def FeatureCollection: FeatureCollection = "FeatureCollection".asInstanceOf[FeatureCollection]
  
  @js.native
  sealed trait GeometryCollection extends StObject
  inline def GeometryCollection: GeometryCollection = "GeometryCollection".asInstanceOf[GeometryCollection]
  
  @js.native
  sealed trait LineString extends StObject
  inline def LineString: LineString = "LineString".asInstanceOf[LineString]
  
  @js.native
  sealed trait MultiLineString extends StObject
  inline def MultiLineString: MultiLineString = "MultiLineString".asInstanceOf[MultiLineString]
  
  @js.native
  sealed trait MultiPoint extends StObject
  inline def MultiPoint: MultiPoint = "MultiPoint".asInstanceOf[MultiPoint]
  
  @js.native
  sealed trait MultiPolygon extends StObject
  inline def MultiPolygon: MultiPolygon = "MultiPolygon".asInstanceOf[MultiPolygon]
  
  @js.native
  sealed trait Point extends StObject
  inline def Point: Point = "Point".asInstanceOf[Point]
  
  @js.native
  sealed trait Polygon extends StObject
  inline def Polygon: Polygon = "Polygon".asInstanceOf[Polygon]
  
  @js.native
  sealed trait TRUE extends StObject
  inline def TRUE: TRUE = "TRUE".asInstanceOf[TRUE]
  
  @js.native
  sealed trait a extends StObject
  inline def a: a = "a".asInstanceOf[a]
  
  @js.native
  sealed trait abbr extends StObject
  inline def abbr: abbr = "abbr".asInstanceOf[abbr]
  
  @js.native
  sealed trait abort extends StObject
  inline def abort: abort = "abort".asInstanceOf[abort]
  
  @js.native
  sealed trait address extends StObject
  inline def address: address = "address".asInstanceOf[address]
  
  @js.native
  sealed trait all extends StObject
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait android extends StObject
  inline def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait animationcancel extends StObject
  inline def animationcancel: animationcancel = "animationcancel".asInstanceOf[animationcancel]
  
  @js.native
  sealed trait animationend extends StObject
  inline def animationend: animationend = "animationend".asInstanceOf[animationend]
  
  @js.native
  sealed trait animationiteration extends StObject
  inline def animationiteration: animationiteration = "animationiteration".asInstanceOf[animationiteration]
  
  @js.native
  sealed trait animationstart extends StObject
  inline def animationstart: animationstart = "animationstart".asInstanceOf[animationstart]
  
  @js.native
  sealed trait area extends StObject
  inline def area: area = "area".asInstanceOf[area]
  
  @js.native
  sealed trait article extends StObject
  inline def article: article = "article".asInstanceOf[article]
  
  @js.native
  sealed trait aside extends StObject
  inline def aside: aside = "aside".asInstanceOf[aside]
  
  @js.native
  sealed trait audio extends StObject
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait auxclick extends StObject
  inline def auxclick: auxclick = "auxclick".asInstanceOf[auxclick]
  
  @js.native
  sealed trait b extends StObject
  inline def b: b = "b".asInstanceOf[b]
  
  @js.native
  sealed trait baidu
    extends StObject
       with Type
  inline def baidu: baidu = "baidu".asInstanceOf[baidu]
  
  @js.native
  sealed trait base extends StObject
  inline def base: base = "base".asInstanceOf[base]
  
  @js.native
  sealed trait bdi extends StObject
  inline def bdi: bdi = "bdi".asInstanceOf[bdi]
  
  @js.native
  sealed trait bdo extends StObject
  inline def bdo: bdo = "bdo".asInstanceOf[bdo]
  
  @js.native
  sealed trait beforeinput extends StObject
  inline def beforeinput: beforeinput = "beforeinput".asInstanceOf[beforeinput]
  
  @js.native
  sealed trait bevel
    extends StObject
       with StrokeLineJoin
  inline def bevel: bevel = "bevel".asInstanceOf[bevel]
  
  @js.native
  sealed trait bg
    extends StObject
       with typings.amapJsApi.AMap.Map.Feature
  inline def bg: bg = "bg".asInstanceOf[bg]
  
  @js.native
  sealed trait blockquote extends StObject
  inline def blockquote: blockquote = "blockquote".asInstanceOf[blockquote]
  
  @js.native
  sealed trait blur extends StObject
  inline def blur: blur = "blur".asInstanceOf[blur]
  
  @js.native
  sealed trait body extends StObject
  inline def body: body = "body".asInstanceOf[body]
  
  @js.native
  sealed trait bold
    extends StObject
       with FontWeight
  inline def bold: bold = "bold".asInstanceOf[bold]
  
  @js.native
  sealed trait bottom
    extends StObject
       with LabelDirection
       with TextDirection
       with VerticalAlign
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait `bottom-center`
    extends StObject
       with Anchor
       with typings.amapJsApi.AMap.Marker.Anchor
       with typings.amapJsApi.AMap.InfoWindow.Anchor
  inline def `bottom-center`: `bottom-center` = "bottom-center".asInstanceOf[`bottom-center`]
  
  @js.native
  sealed trait `bottom-left`
    extends StObject
       with Anchor
       with typings.amapJsApi.AMap.Marker.Anchor
       with typings.amapJsApi.AMap.InfoWindow.Anchor
  inline def `bottom-left`: `bottom-left` = "bottom-left".asInstanceOf[`bottom-left`]
  
  @js.native
  sealed trait `bottom-right`
    extends StObject
       with Anchor
       with typings.amapJsApi.AMap.Marker.Anchor
       with typings.amapJsApi.AMap.InfoWindow.Anchor
  inline def `bottom-right`: `bottom-right` = "bottom-right".asInstanceOf[`bottom-right`]
  
  @js.native
  sealed trait br extends StObject
  inline def br: br = "br".asInstanceOf[br]
  
  @js.native
  sealed trait building
    extends StObject
       with typings.amapJsApi.AMap.Map.Feature
  inline def building: building = "building".asInstanceOf[building]
  
  @js.native
  sealed trait butt
    extends StObject
       with StrokeLineCap
  inline def butt: butt = "butt".asInstanceOf[butt]
  
  @js.native
  sealed trait button extends StObject
  inline def button: button = "button".asInstanceOf[button]
  
  @js.native
  sealed trait c extends StObject
  inline def c: c = "c".asInstanceOf[c]
  
  @js.native
  sealed trait cancel extends StObject
  inline def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @js.native
  sealed trait canplay extends StObject
  inline def canplay: canplay = "canplay".asInstanceOf[canplay]
  
  @js.native
  sealed trait canplaythrough extends StObject
  inline def canplaythrough: canplaythrough = "canplaythrough".asInstanceOf[canplaythrough]
  
  @js.native
  sealed trait canvas extends StObject
  inline def canvas: canvas = "canvas".asInstanceOf[canvas]
  
  @js.native
  sealed trait caption extends StObject
  inline def caption: caption = "caption".asInstanceOf[caption]
  
  @js.native
  sealed trait center
    extends StObject
       with Anchor
       with typings.amapJsApi.AMap.Marker.Anchor
       with typings.amapJsApi.AMap.InfoWindow.Anchor
       with LabelDirection
       with TextAlign
       with TextDirection
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait change extends StObject
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait circle extends StObject
  inline def circle: circle = "circle".asInstanceOf[circle]
  
  @js.native
  sealed trait cite extends StObject
  inline def cite: cite = "cite".asInstanceOf[cite]
  
  @js.native
  sealed trait click extends StObject
  inline def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait close extends StObject
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait code extends StObject
  inline def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait col extends StObject
  inline def col: col = "col".asInstanceOf[col]
  
  @js.native
  sealed trait colgroup extends StObject
  inline def colgroup: colgroup = "colgroup".asInstanceOf[colgroup]
  
  @js.native
  sealed trait complete
    extends StObject
       with SearchStatus
  inline def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait compositionend extends StObject
  inline def compositionend: compositionend = "compositionend".asInstanceOf[compositionend]
  
  @js.native
  sealed trait compositionstart extends StObject
  inline def compositionstart: compositionstart = "compositionstart".asInstanceOf[compositionstart]
  
  @js.native
  sealed trait compositionupdate extends StObject
  inline def compositionupdate: compositionupdate = "compositionupdate".asInstanceOf[compositionupdate]
  
  @js.native
  sealed trait contextmenu extends StObject
  inline def contextmenu: contextmenu = "contextmenu".asInstanceOf[contextmenu]
  
  @js.native
  sealed trait copy extends StObject
  inline def copy: copy = "copy".asInstanceOf[copy]
  
  @js.native
  sealed trait cuechange extends StObject
  inline def cuechange: cuechange = "cuechange".asInstanceOf[cuechange]
  
  @js.native
  sealed trait cut extends StObject
  inline def cut: cut = "cut".asInstanceOf[cut]
  
  @js.native
  sealed trait d extends StObject
  inline def d: d = "d".asInstanceOf[d]
  
  @js.native
  sealed trait dashed
    extends StObject
       with StrokeStyle
  inline def dashed: dashed = "dashed".asInstanceOf[dashed]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait datalist extends StObject
  inline def datalist: datalist = "datalist".asInstanceOf[datalist]
  
  @js.native
  sealed trait dblclick extends StObject
  inline def dblclick: dblclick = "dblclick".asInstanceOf[dblclick]
  
  @js.native
  sealed trait dd extends StObject
  inline def dd: dd = "dd".asInstanceOf[dd]
  
  @js.native
  sealed trait del extends StObject
  inline def del: del = "del".asInstanceOf[del]
  
  @js.native
  sealed trait details extends StObject
  inline def details: details = "details".asInstanceOf[details]
  
  @js.native
  sealed trait dfn extends StObject
  inline def dfn: dfn = "dfn".asInstanceOf[dfn]
  
  @js.native
  sealed trait dialog extends StObject
  inline def dialog: dialog = "dialog".asInstanceOf[dialog]
  
  @js.native
  sealed trait div extends StObject
  inline def div: div = "div".asInstanceOf[div]
  
  @js.native
  sealed trait dl extends StObject
  inline def dl: dl = "dl".asInstanceOf[dl]
  
  @js.native
  sealed trait drag extends StObject
  inline def drag: drag = "drag".asInstanceOf[drag]
  
  @js.native
  sealed trait dragend extends StObject
  inline def dragend: dragend = "dragend".asInstanceOf[dragend]
  
  @js.native
  sealed trait dragenter extends StObject
  inline def dragenter: dragenter = "dragenter".asInstanceOf[dragenter]
  
  @js.native
  sealed trait dragging extends StObject
  inline def dragging: dragging = "dragging".asInstanceOf[dragging]
  
  @js.native
  sealed trait dragleave extends StObject
  inline def dragleave: dragleave = "dragleave".asInstanceOf[dragleave]
  
  @js.native
  sealed trait dragover extends StObject
  inline def dragover: dragover = "dragover".asInstanceOf[dragover]
  
  @js.native
  sealed trait dragstart extends StObject
  inline def dragstart: dragstart = "dragstart".asInstanceOf[dragstart]
  
  @js.native
  sealed trait drop extends StObject
  inline def drop: drop = "drop".asInstanceOf[drop]
  
  @js.native
  sealed trait dt extends StObject
  inline def dt: dt = "dt".asInstanceOf[dt]
  
  @js.native
  sealed trait durationchange extends StObject
  inline def durationchange: durationchange = "durationchange".asInstanceOf[durationchange]
  
  @js.native
  sealed trait dv extends StObject
  inline def dv: dv = "dv".asInstanceOf[dv]
  
  @js.native
  sealed trait em extends StObject
  inline def em: em = "em".asInstanceOf[em]
  
  @js.native
  sealed trait embed extends StObject
  inline def embed: embed = "embed".asInstanceOf[embed]
  
  @js.native
  sealed trait emptied extends StObject
  inline def emptied: emptied = "emptied".asInstanceOf[emptied]
  
  @js.native
  sealed trait en
    extends StObject
       with Lang
  inline def en: en = "en".asInstanceOf[en]
  
  @js.native
  sealed trait ended extends StObject
  inline def ended: ended = "ended".asInstanceOf[ended]
  
  @js.native
  sealed trait error
    extends StObject
       with SearchStatus
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fieldset extends StObject
  inline def fieldset: fieldset = "fieldset".asInstanceOf[fieldset]
  
  @js.native
  sealed trait figcaption extends StObject
  inline def figcaption: figcaption = "figcaption".asInstanceOf[figcaption]
  
  @js.native
  sealed trait figure extends StObject
  inline def figure: figure = "figure".asInstanceOf[figure]
  
  @js.native
  sealed trait focus extends StObject
  inline def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait focusin extends StObject
  inline def focusin: focusin = "focusin".asInstanceOf[focusin]
  
  @js.native
  sealed trait focusout extends StObject
  inline def focusout: focusout = "focusout".asInstanceOf[focusout]
  
  @js.native
  sealed trait footer extends StObject
  inline def footer: footer = "footer".asInstanceOf[footer]
  
  @js.native
  sealed trait form extends StObject
  inline def form: form = "form".asInstanceOf[form]
  
  @js.native
  sealed trait formdata extends StObject
  inline def formdata: formdata = "formdata".asInstanceOf[formdata]
  
  @js.native
  sealed trait fullscreenchange extends StObject
  inline def fullscreenchange: fullscreenchange = "fullscreenchange".asInstanceOf[fullscreenchange]
  
  @js.native
  sealed trait fullscreenerror extends StObject
  inline def fullscreenerror: fullscreenerror = "fullscreenerror".asInstanceOf[fullscreenerror]
  
  @js.native
  sealed trait gotpointercapture extends StObject
  inline def gotpointercapture: gotpointercapture = "gotpointercapture".asInstanceOf[gotpointercapture]
  
  @js.native
  sealed trait gps
    extends StObject
       with Type
  inline def gps: gps = "gps".asInstanceOf[gps]
  
  @js.native
  sealed trait h1 extends StObject
  inline def h1: h1 = "h1".asInstanceOf[h1]
  
  @js.native
  sealed trait h2 extends StObject
  inline def h2: h2 = "h2".asInstanceOf[h2]
  
  @js.native
  sealed trait h3 extends StObject
  inline def h3: h3 = "h3".asInstanceOf[h3]
  
  @js.native
  sealed trait h4 extends StObject
  inline def h4: h4 = "h4".asInstanceOf[h4]
  
  @js.native
  sealed trait h5 extends StObject
  inline def h5: h5 = "h5".asInstanceOf[h5]
  
  @js.native
  sealed trait h6 extends StObject
  inline def h6: h6 = "h6".asInstanceOf[h6]
  
  @js.native
  sealed trait head extends StObject
  inline def head: head = "head".asInstanceOf[head]
  
  @js.native
  sealed trait header extends StObject
  inline def header: header = "header".asInstanceOf[header]
  
  @js.native
  sealed trait hgroup extends StObject
  inline def hgroup: hgroup = "hgroup".asInstanceOf[hgroup]
  
  @js.native
  sealed trait hide extends StObject
  inline def hide: hide = "hide".asInstanceOf[hide]
  
  @js.native
  sealed trait hotspotclick extends StObject
  inline def hotspotclick: hotspotclick = "hotspotclick".asInstanceOf[hotspotclick]
  
  @js.native
  sealed trait hotspotout extends StObject
  inline def hotspotout: hotspotout = "hotspotout".asInstanceOf[hotspotout]
  
  @js.native
  sealed trait hotspotover extends StObject
  inline def hotspotover: hotspotover = "hotspotover".asInstanceOf[hotspotover]
  
  @js.native
  sealed trait hr extends StObject
  inline def hr: hr = "hr".asInstanceOf[hr]
  
  @js.native
  sealed trait html extends StObject
  inline def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait i extends StObject
  inline def i: i = "i".asInstanceOf[i]
  
  @js.native
  sealed trait iframe extends StObject
  inline def iframe: iframe = "iframe".asInstanceOf[iframe]
  
  @js.native
  sealed trait img extends StObject
  inline def img: img = "img".asInstanceOf[img]
  
  @js.native
  sealed trait input extends StObject
  inline def input: input = "input".asInstanceOf[input]
  
  @js.native
  sealed trait ins extends StObject
  inline def ins: ins = "ins".asInstanceOf[ins]
  
  @js.native
  sealed trait invalid extends StObject
  inline def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @js.native
  sealed trait ios extends StObject
  inline def ios: ios = "ios".asInstanceOf[ios]
  
  @js.native
  sealed trait items extends StObject
  inline def items: items = "items".asInstanceOf[items]
  
  @js.native
  sealed trait kbd extends StObject
  inline def kbd: kbd = "kbd".asInstanceOf[kbd]
  
  @js.native
  sealed trait keydown extends StObject
  inline def keydown: keydown = "keydown".asInstanceOf[keydown]
  
  @js.native
  sealed trait keypress extends StObject
  inline def keypress: keypress = "keypress".asInstanceOf[keypress]
  
  @js.native
  sealed trait keyup extends StObject
  inline def keyup: keyup = "keyup".asInstanceOf[keyup]
  
  @js.native
  sealed trait label extends StObject
  inline def label: label = "label".asInstanceOf[label]
  
  @js.native
  sealed trait left
    extends StObject
       with LabelDirection
       with TextAlign
       with TextDirection
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait legend extends StObject
  inline def legend: legend = "legend".asInstanceOf[legend]
  
  @js.native
  sealed trait li extends StObject
  inline def li: li = "li".asInstanceOf[li]
  
  @js.native
  sealed trait link extends StObject
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait lnglat extends StObject
  inline def lnglat: lnglat = "lnglat".asInstanceOf[lnglat]
  
  @js.native
  sealed trait load extends StObject
  inline def load: load = "load".asInstanceOf[load]
  
  @js.native
  sealed trait loadeddata extends StObject
  inline def loadeddata: loadeddata = "loadeddata".asInstanceOf[loadeddata]
  
  @js.native
  sealed trait loadedmetadata extends StObject
  inline def loadedmetadata: loadedmetadata = "loadedmetadata".asInstanceOf[loadedmetadata]
  
  @js.native
  sealed trait loadstart extends StObject
  inline def loadstart: loadstart = "loadstart".asInstanceOf[loadstart]
  
  @js.native
  sealed trait lostpointercapture extends StObject
  inline def lostpointercapture: lostpointercapture = "lostpointercapture".asInstanceOf[lostpointercapture]
  
  @js.native
  sealed trait mac extends StObject
  inline def mac: mac = "mac".asInstanceOf[mac]
  
  @js.native
  sealed trait main extends StObject
  inline def main: main = "main".asInstanceOf[main]
  
  @js.native
  sealed trait map extends StObject
  inline def map: map = "map".asInstanceOf[map]
  
  @js.native
  sealed trait mapbar
    extends StObject
       with Type
  inline def mapbar: mapbar = "mapbar".asInstanceOf[mapbar]
  
  @js.native
  sealed trait mapmove extends StObject
  inline def mapmove: mapmove = "mapmove".asInstanceOf[mapmove]
  
  @js.native
  sealed trait mark extends StObject
  inline def mark: mark = "mark".asInstanceOf[mark]
  
  @js.native
  sealed trait marker extends StObject
  inline def marker: marker = "marker".asInstanceOf[marker]
  
  @js.native
  sealed trait menu extends StObject
  inline def menu: menu = "menu".asInstanceOf[menu]
  
  @js.native
  sealed trait meta extends StObject
  inline def meta: meta = "meta".asInstanceOf[meta]
  
  @js.native
  sealed trait meter extends StObject
  inline def meter: meter = "meter".asInstanceOf[meter]
  
  @js.native
  sealed trait middle
    extends StObject
       with VerticalAlign
  inline def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait `middle-left`
    extends StObject
       with Anchor
       with typings.amapJsApi.AMap.Marker.Anchor
       with typings.amapJsApi.AMap.InfoWindow.Anchor
  inline def `middle-left`: `middle-left` = "middle-left".asInstanceOf[`middle-left`]
  
  @js.native
  sealed trait `middle-right`
    extends StObject
       with Anchor
       with typings.amapJsApi.AMap.Marker.Anchor
       with typings.amapJsApi.AMap.InfoWindow.Anchor
  inline def `middle-right`: `middle-right` = "middle-right".asInstanceOf[`middle-right`]
  
  @js.native
  sealed trait miter
    extends StObject
       with StrokeLineJoin
  inline def miter: miter = "miter".asInstanceOf[miter]
  
  @js.native
  sealed trait mousedown extends StObject
  inline def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  
  @js.native
  sealed trait mouseenter extends StObject
  inline def mouseenter: mouseenter = "mouseenter".asInstanceOf[mouseenter]
  
  @js.native
  sealed trait mouseleave extends StObject
  inline def mouseleave: mouseleave = "mouseleave".asInstanceOf[mouseleave]
  
  @js.native
  sealed trait mousemove extends StObject
  inline def mousemove: mousemove = "mousemove".asInstanceOf[mousemove]
  
  @js.native
  sealed trait mouseout extends StObject
  inline def mouseout: mouseout = "mouseout".asInstanceOf[mouseout]
  
  @js.native
  sealed trait mouseover extends StObject
  inline def mouseover: mouseover = "mouseover".asInstanceOf[mouseover]
  
  @js.native
  sealed trait mouseup extends StObject
  inline def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  
  @js.native
  sealed trait mousewheel extends StObject
  inline def mousewheel: mousewheel = "mousewheel".asInstanceOf[mousewheel]
  
  @js.native
  sealed trait movealong extends StObject
  inline def movealong: movealong = "movealong".asInstanceOf[movealong]
  
  @js.native
  sealed trait moveend extends StObject
  inline def moveend: moveend = "moveend".asInstanceOf[moveend]
  
  @js.native
  sealed trait movestart extends StObject
  inline def movestart: movestart = "movestart".asInstanceOf[movestart]
  
  @js.native
  sealed trait moving extends StObject
  inline def moving: moving = "moving".asInstanceOf[moving]
  
  @js.native
  sealed trait mv extends StObject
  inline def mv: mv = "mv".asInstanceOf[mv]
  
  @js.native
  sealed trait nav extends StObject
  inline def nav: nav = "nav".asInstanceOf[nav]
  
  @js.native
  sealed trait normal
    extends StObject
       with FontWeight
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait noscript extends StObject
  inline def noscript: noscript = "noscript".asInstanceOf[noscript]
  
  @js.native
  sealed trait `object` extends StObject
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait ol extends StObject
  inline def ol: ol = "ol".asInstanceOf[ol]
  
  @js.native
  sealed trait open extends StObject
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait optgroup extends StObject
  inline def optgroup: optgroup = "optgroup".asInstanceOf[optgroup]
  
  @js.native
  sealed trait option extends StObject
  inline def option: option = "option".asInstanceOf[option]
  
  @js.native
  sealed trait options extends StObject
  inline def options: options = "options".asInstanceOf[options]
  
  @js.native
  sealed trait other extends StObject
  inline def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait output extends StObject
  inline def output: output = "output".asInstanceOf[output]
  
  @js.native
  sealed trait p extends StObject
  inline def p: p = "p".asInstanceOf[p]
  
  @js.native
  sealed trait paste extends StObject
  inline def paste: paste = "paste".asInstanceOf[paste]
  
  @js.native
  sealed trait pause extends StObject
  inline def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait picture extends StObject
  inline def picture: picture = "picture".asInstanceOf[picture]
  
  @js.native
  sealed trait play extends StObject
  inline def play: play = "play".asInstanceOf[play]
  
  @js.native
  sealed trait playing extends StObject
  inline def playing: playing = "playing".asInstanceOf[playing]
  
  @js.native
  sealed trait point_
    extends StObject
       with typings.amapJsApi.AMap.Map.Feature
  inline def point_ : point_ = "point".asInstanceOf[point_]
  
  @js.native
  sealed trait pointercancel extends StObject
  inline def pointercancel: pointercancel = "pointercancel".asInstanceOf[pointercancel]
  
  @js.native
  sealed trait pointerdown extends StObject
  inline def pointerdown: pointerdown = "pointerdown".asInstanceOf[pointerdown]
  
  @js.native
  sealed trait pointerenter extends StObject
  inline def pointerenter: pointerenter = "pointerenter".asInstanceOf[pointerenter]
  
  @js.native
  sealed trait pointerleave extends StObject
  inline def pointerleave: pointerleave = "pointerleave".asInstanceOf[pointerleave]
  
  @js.native
  sealed trait pointermove extends StObject
  inline def pointermove: pointermove = "pointermove".asInstanceOf[pointermove]
  
  @js.native
  sealed trait pointerout extends StObject
  inline def pointerout: pointerout = "pointerout".asInstanceOf[pointerout]
  
  @js.native
  sealed trait pointerover extends StObject
  inline def pointerover: pointerover = "pointerover".asInstanceOf[pointerover]
  
  @js.native
  sealed trait pointerup extends StObject
  inline def pointerup: pointerup = "pointerup".asInstanceOf[pointerup]
  
  @js.native
  sealed trait poly extends StObject
  inline def poly: poly = "poly".asInstanceOf[poly]
  
  @js.native
  sealed trait polygon_ extends StObject
  inline def polygon_ : polygon_ = "polygon".asInstanceOf[polygon_]
  
  @js.native
  sealed trait polyline extends StObject
  inline def polyline: polyline = "polyline".asInstanceOf[polyline]
  
  @js.native
  sealed trait pre extends StObject
  inline def pre: pre = "pre".asInstanceOf[pre]
  
  @js.native
  sealed trait progress extends StObject
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait px extends StObject
  inline def px: px = "px".asInstanceOf[px]
  
  @js.native
  sealed trait q extends StObject
  inline def q: q = "q".asInstanceOf[q]
  
  @js.native
  sealed trait ratechange extends StObject
  inline def ratechange: ratechange = "ratechange".asInstanceOf[ratechange]
  
  @js.native
  sealed trait rdblclick extends StObject
  inline def rdblclick: rdblclick = "rdblclick".asInstanceOf[rdblclick]
  
  @js.native
  sealed trait rect extends StObject
  inline def rect: rect = "rect".asInstanceOf[rect]
  
  @js.native
  sealed trait reset extends StObject
  inline def reset: reset = "reset".asInstanceOf[reset]
  
  @js.native
  sealed trait resize extends StObject
  inline def resize: resize = "resize".asInstanceOf[resize]
  
  @js.native
  sealed trait right
    extends StObject
       with LabelDirection
       with TextAlign
       with TextDirection
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait rightclick extends StObject
  inline def rightclick: rightclick = "rightclick".asInstanceOf[rightclick]
  
  @js.native
  sealed trait road
    extends StObject
       with typings.amapJsApi.AMap.Map.Feature
  inline def road: road = "road".asInstanceOf[road]
  
  @js.native
  sealed trait round
    extends StObject
       with StrokeLineCap
       with StrokeLineJoin
  inline def round: round = "round".asInstanceOf[round]
  
  @js.native
  sealed trait rp extends StObject
  inline def rp: rp = "rp".asInstanceOf[rp]
  
  @js.native
  sealed trait rt extends StObject
  inline def rt: rt = "rt".asInstanceOf[rt]
  
  @js.native
  sealed trait ruby extends StObject
  inline def ruby: ruby = "ruby".asInstanceOf[ruby]
  
  @js.native
  sealed trait s extends StObject
  inline def s: s = "s".asInstanceOf[s]
  
  @js.native
  sealed trait samp extends StObject
  inline def samp: samp = "samp".asInstanceOf[samp]
  
  @js.native
  sealed trait script extends StObject
  inline def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait scroll extends StObject
  inline def scroll: scroll = "scroll".asInstanceOf[scroll]
  
  @js.native
  sealed trait search extends StObject
  inline def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait section extends StObject
  inline def section: section = "section".asInstanceOf[section]
  
  @js.native
  sealed trait securitypolicyviolation extends StObject
  inline def securitypolicyviolation: securitypolicyviolation = "securitypolicyviolation".asInstanceOf[securitypolicyviolation]
  
  @js.native
  sealed trait seeked extends StObject
  inline def seeked: seeked = "seeked".asInstanceOf[seeked]
  
  @js.native
  sealed trait seeking extends StObject
  inline def seeking: seeking = "seeking".asInstanceOf[seeking]
  
  @js.native
  sealed trait select extends StObject
  inline def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait selectionchange extends StObject
  inline def selectionchange: selectionchange = "selectionchange".asInstanceOf[selectionchange]
  
  @js.native
  sealed trait selectstart extends StObject
  inline def selectstart: selectstart = "selectstart".asInstanceOf[selectstart]
  
  @js.native
  sealed trait setBounds extends StObject
  inline def setBounds: setBounds = "setBounds".asInstanceOf[setBounds]
  
  @js.native
  sealed trait setCenter extends StObject
  inline def setCenter: setCenter = "setCenter".asInstanceOf[setCenter]
  
  @js.native
  sealed trait setPath extends StObject
  inline def setPath: setPath = "setPath".asInstanceOf[setPath]
  
  @js.native
  sealed trait setRadius extends StObject
  inline def setRadius: setRadius = "setRadius".asInstanceOf[setRadius]
  
  @js.native
  sealed trait show extends StObject
  inline def show: show = "show".asInstanceOf[show]
  
  @js.native
  sealed trait slot extends StObject
  inline def slot: slot = "slot".asInstanceOf[slot]
  
  @js.native
  sealed trait slotchange extends StObject
  inline def slotchange: slotchange = "slotchange".asInstanceOf[slotchange]
  
  @js.native
  sealed trait small extends StObject
  inline def small: small = "small".asInstanceOf[small]
  
  @js.native
  sealed trait solid
    extends StObject
       with StrokeStyle
  inline def solid: solid = "solid".asInstanceOf[solid]
  
  @js.native
  sealed trait source extends StObject
  inline def source: source = "source".asInstanceOf[source]
  
  @js.native
  sealed trait span extends StObject
  inline def span: span = "span".asInstanceOf[span]
  
  @js.native
  sealed trait square
    extends StObject
       with StrokeLineCap
  inline def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait stalled extends StObject
  inline def stalled: stalled = "stalled".asInstanceOf[stalled]
  
  @js.native
  sealed trait strong extends StObject
  inline def strong: strong = "strong".asInstanceOf[strong]
  
  @js.native
  sealed trait style extends StObject
  inline def style: style = "style".asInstanceOf[style]
  
  @js.native
  sealed trait sub extends StObject
  inline def sub: sub = "sub".asInstanceOf[sub]
  
  @js.native
  sealed trait submit extends StObject
  inline def submit: submit = "submit".asInstanceOf[submit]
  
  @js.native
  sealed trait summary extends StObject
  inline def summary: summary = "summary".asInstanceOf[summary]
  
  @js.native
  sealed trait sup extends StObject
  inline def sup: sup = "sup".asInstanceOf[sup]
  
  @js.native
  sealed trait suspend extends StObject
  inline def suspend: suspend = "suspend".asInstanceOf[suspend]
  
  @js.native
  sealed trait table extends StObject
  inline def table: table = "table".asInstanceOf[table]
  
  @js.native
  sealed trait tbody extends StObject
  inline def tbody: tbody = "tbody".asInstanceOf[tbody]
  
  @js.native
  sealed trait td extends StObject
  inline def td: td = "td".asInstanceOf[td]
  
  @js.native
  sealed trait template extends StObject
  inline def template: template = "template".asInstanceOf[template]
  
  @js.native
  sealed trait textarea extends StObject
  inline def textarea: textarea = "textarea".asInstanceOf[textarea]
  
  @js.native
  sealed trait tfoot extends StObject
  inline def tfoot: tfoot = "tfoot".asInstanceOf[tfoot]
  
  @js.native
  sealed trait th extends StObject
  inline def th: th = "th".asInstanceOf[th]
  
  @js.native
  sealed trait thead extends StObject
  inline def thead: thead = "thead".asInstanceOf[thead]
  
  @js.native
  sealed trait thin
    extends StObject
       with FontWeight
  inline def thin: thin = "thin".asInstanceOf[thin]
  
  @js.native
  sealed trait time extends StObject
  inline def time: time = "time".asInstanceOf[time]
  
  @js.native
  sealed trait timeupdate extends StObject
  inline def timeupdate: timeupdate = "timeupdate".asInstanceOf[timeupdate]
  
  @js.native
  sealed trait title extends StObject
  inline def title: title = "title".asInstanceOf[title]
  
  @js.native
  sealed trait toggle extends StObject
  inline def toggle: toggle = "toggle".asInstanceOf[toggle]
  
  @js.native
  sealed trait top
    extends StObject
       with LabelDirection
       with TextDirection
       with VerticalAlign
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait `top-center`
    extends StObject
       with Anchor
       with typings.amapJsApi.AMap.Marker.Anchor
       with typings.amapJsApi.AMap.InfoWindow.Anchor
  inline def `top-center`: `top-center` = "top-center".asInstanceOf[`top-center`]
  
  @js.native
  sealed trait `top-left`
    extends StObject
       with Anchor
       with typings.amapJsApi.AMap.Marker.Anchor
       with typings.amapJsApi.AMap.InfoWindow.Anchor
  inline def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  
  @js.native
  sealed trait `top-right`
    extends StObject
       with Anchor
       with typings.amapJsApi.AMap.Marker.Anchor
       with typings.amapJsApi.AMap.InfoWindow.Anchor
  inline def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  
  @js.native
  sealed trait touchcancel extends StObject
  inline def touchcancel: touchcancel = "touchcancel".asInstanceOf[touchcancel]
  
  @js.native
  sealed trait touchend extends StObject
  inline def touchend: touchend = "touchend".asInstanceOf[touchend]
  
  @js.native
  sealed trait touchmove extends StObject
  inline def touchmove: touchmove = "touchmove".asInstanceOf[touchmove]
  
  @js.native
  sealed trait touchstart extends StObject
  inline def touchstart: touchstart = "touchstart".asInstanceOf[touchstart]
  
  @js.native
  sealed trait tr extends StObject
  inline def tr: tr = "tr".asInstanceOf[tr]
  
  @js.native
  sealed trait track extends StObject
  inline def track: track = "track".asInstanceOf[track]
  
  @js.native
  sealed trait transitioncancel extends StObject
  inline def transitioncancel: transitioncancel = "transitioncancel".asInstanceOf[transitioncancel]
  
  @js.native
  sealed trait transitionend extends StObject
  inline def transitionend: transitionend = "transitionend".asInstanceOf[transitionend]
  
  @js.native
  sealed trait transitionrun extends StObject
  inline def transitionrun: transitionrun = "transitionrun".asInstanceOf[transitionrun]
  
  @js.native
  sealed trait transitionstart extends StObject
  inline def transitionstart: transitionstart = "transitionstart".asInstanceOf[transitionstart]
  
  @js.native
  sealed trait u extends StObject
  inline def u: u = "u".asInstanceOf[u]
  
  @js.native
  sealed trait ul extends StObject
  inline def ul: ul = "ul".asInstanceOf[ul]
  
  @js.native
  sealed trait v extends StObject
  inline def v: v = "v".asInstanceOf[v]
  
  @js.native
  sealed trait `var` extends StObject
  inline def `var`: `var` = "var".asInstanceOf[`var`]
  
  @js.native
  sealed trait video extends StObject
  inline def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait volumechange extends StObject
  inline def volumechange: volumechange = "volumechange".asInstanceOf[volumechange]
  
  @js.native
  sealed trait vw extends StObject
  inline def vw: vw = "vw".asInstanceOf[vw]
  
  @js.native
  sealed trait waiting extends StObject
  inline def waiting: waiting = "waiting".asInstanceOf[waiting]
  
  @js.native
  sealed trait wbr extends StObject
  inline def wbr: wbr = "wbr".asInstanceOf[wbr]
  
  @js.native
  sealed trait webkitanimationend extends StObject
  inline def webkitanimationend: webkitanimationend = "webkitanimationend".asInstanceOf[webkitanimationend]
  
  @js.native
  sealed trait webkitanimationiteration extends StObject
  inline def webkitanimationiteration: webkitanimationiteration = "webkitanimationiteration".asInstanceOf[webkitanimationiteration]
  
  @js.native
  sealed trait webkitanimationstart extends StObject
  inline def webkitanimationstart: webkitanimationstart = "webkitanimationstart".asInstanceOf[webkitanimationstart]
  
  @js.native
  sealed trait webkittransitionend extends StObject
  inline def webkittransitionend: webkittransitionend = "webkittransitionend".asInstanceOf[webkittransitionend]
  
  @js.native
  sealed trait wheel extends StObject
  inline def wheel: wheel = "wheel".asInstanceOf[wheel]
  
  @js.native
  sealed trait windows extends StObject
  inline def windows: windows = "windows".asInstanceOf[windows]
  
  @js.native
  sealed trait zh_cn
    extends StObject
       with Lang
  inline def zh_cn: zh_cn = "zh_cn".asInstanceOf[zh_cn]
  
  @js.native
  sealed trait zh_en
    extends StObject
       with Lang
  inline def zh_en: zh_en = "zh_en".asInstanceOf[zh_en]
  
  @js.native
  sealed trait zoomchange extends StObject
  inline def zoomchange: zoomchange = "zoomchange".asInstanceOf[zoomchange]
  
  @js.native
  sealed trait zoomend extends StObject
  inline def zoomend: zoomend = "zoomend".asInstanceOf[zoomend]
  
  @js.native
  sealed trait zoomstart extends StObject
  inline def zoomstart: zoomstart = "zoomstart".asInstanceOf[zoomstart]
}
