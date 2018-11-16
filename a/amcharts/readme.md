```
/**
 * AmBalloon is the class which generates balloons (datatips).
 * Balloon follows the mouse when you roll-over the pie slice/line bullet/column/etc, chart indicator of
 * serial charts displays value balloons and category balloon.
 * Balloon instance is created by the chart automatically and can be accessed via "balloon" property of AmChart.
 * Chart shows/hides and sets position for every balloon automatically,
 * so all you need to do is to change balloon appearance, if you want to.
 * @example
 * let chart = new AmCharts.AmSerialChart();
 * // get balloon intance
 * let balloon = chart.balloon;
 * // set properties
 * balloon.adjustBorderColor = true;
 * balloon.color = "#000000";
 * balloon.cornerRadius = 5;
 * balloon.fillColor = "#FFFFFF";
 */
/**
 * AreasSettings is a class which holds common settings of all MapArea objects.
 */
/**
 * CategoryAxesSettings settings set's settings common for all CategoryAxes of StockPanels.
 * If you change a property after the chart is initialized, you should call stockChart.validateNow() method in
 * order for it to work. If there is no default value specified, default value of CategoryAxis class will be used.
 */
/**
 * ChartCursorSettings settings set's settings for chart cursor.
 * If you change a property after the chart is initialized, you should call stockChart.validateNow() method
 * in order for it to work. If there is no default value specified, default value of ChartCursor class will be used.
 */
/**
 * DataSetSelector is a tool for selecting data set's as main and for comparing with main data set.
 */
/**
 * Seems like this is meant: https://github.com/amcharts/export
 */
/**
 * ImagesSettings is a class which holds common settings of all MapImage objects.
 */
/**
 * Creates a label on the chart which can be placed anywhere, multiple can be assigned.
 */
/**
 * Common settings of legends.
 * If you change a property after the chart is initialized, you should call stockChart.validateNow() method
 * in order for it to work. If there is no default value specified, default value of StockLegend class will be used.
 */
/**
 * PanelsSettings settings set's settings for all StockPanels.
 * If you change a property after the chart is initialized,
 * you should call stockChart.validateNow() method in order for it to work.
 * If there is no default value specified, default value of StockPanel class will be used.
 */
/**
 * SerialDataItem holds all the information about each series.
 * When working with a chart, you do not create SerialDataItem objects or change it's properties directly.
 * Consider properties of a SerialDataItem read-only - change values in chart's data provider if you need to.
 * When serial chart parses dataProvider, it generates "chartData" array.
 * Objects of this array are SerialDataItem objects.
 */
/**
 * Slice is an item of AmPieChart's chartData Array and holds all the information about the slice.
 * When working with a pie chart, you do not create slices or change it's properties directly,
 * instead you set array of data using dataProvider property.
 * Consider properties of a Slice read-only - change values in chart's data provider if you need to.
 */
/**
 * Trend lines are straight lines indicating trends, might also be used for some different purposes.
 * Can be used by Serial and XY charts.
 * To add/remove trend line, use chart.addTrendLine(trendLine)/chart.removeTrendLine(trendLine) methods
 * or simply pass array of trend lines: chart.trendLines = [trendLine1, trendLine2].
 * @example
 * let trendLine = new AmCharts.TrendLine();
 * trendLine.initialDate = new Date(2012, 0, 2, 12); // 12 is hour - to start trend line in the middle of the day
 * trendLine.finalDate = new Date(2012, 0, 11, 12);
 * trendLine.initialValue = 10;
 * trendLine.finalValue = 19;
 * trendLine.lineColor = "#CC0000";
 * chart.addTrendLine(trendLine);
 */
/**
 * ValueAxesSettings settings sets settings for all ValueAxes.
 * If you change a property after the chart is initialized,
 * you should call stockChart.validateNow() method in order for it to work.
 * If there is no default value specified, default value of ValueAxis class will be used.
 */
// Type definitions for amCharts 3.21
// Project: http://www.amcharts.com/
// Definitions by: ldrick <https://github.com/ldrick>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.2
```